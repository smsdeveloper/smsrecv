package com.slf.engine.services.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import com.slf.common.client.HttpSqsServiceImpl;
import com.slf.common.client.IHttpSqsService;
import com.slf.engine.base.IBaseDao;
import com.slf.engine.bo.CallPMap;
import com.slf.engine.bo.LsDbdx;
import com.slf.engine.bo.LsDxhc;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.bo.XxDl;
import com.slf.engine.common.SysContants;
import com.slf.engine.services.helper.ServiceHelper;
import com.slf.engine.utils.DateUtils;
import com.slf.engine.utils.Factory;

public class BaseService {

	private static final Logger log = Logger.getLogger(BaseService.class);
	
	protected void sendDbDx(LsMosms lsMosms,XxDl xxDl)
	{
		LsDbdx lsDbdx = new LsDbdx();
		lsDbdx.setDlid(lsMosms.getDlid());
		lsDbdx.setDbgjz(lsMosms.getJsnr());
		IBaseDao baseDao = (IBaseDao) Factory.getInstantBiz("baseDao");		
		try {
			lsDbdx = (LsDbdx)baseDao.getObject(lsDbdx, "getDbdxByGjz");
			if(lsDbdx != null)
			{
				lsDbdx = checkIsUsefull(lsDbdx);
				if(lsDbdx.getHfnr() != null)
				{
					log.log(Priority.INFO, "点播短信：" + lsDbdx.getHfnr());
					//下发短信
					CallPMap callPMap = ServiceHelper.makebzj(xxDl, lsDbdx, lsMosms);
					log.log(Priority.INFO, callPMap);
					baseDao.callProcedure(callPMap, "TRAN_KBZJ");
					if(callPMap.isSuccess())
					{
						LsDxhc lsDxhc = new LsDxhc();
						lsDxhc.setDlid(xxDl.getDlid());
						lsDxhc.setHdmbid(lsDbdx.getHdmbid());
						lsDxhc.setDxhmq(lsMosms.getJshm());
						lsDxhc.setClbz("3");
						lsDxhc.setSpjrh(lsMosms.getJsh());
						lsDxhc.setDxhcid(Long.valueOf(callPMap.get("DXHCID") == null ? "0" : callPMap.get("DXHCID").toString()));
						baseDao.modify(lsDxhc, "updateHmq"); //更新号码群
						Map<String, String> obj = new HashMap<String, String>();
						obj.put("dxhcid", String.valueOf(lsDxhc.getDxhcid()));
						IHttpSqsService httpSqsService = new HttpSqsServiceImpl();
						httpSqsService.putIntoSqs(SysContants.SMS_URL,SysContants.SMS_NAME,SysContants.SMS_AUTH, obj);
						lsDbdx.setDjdbcs(lsDbdx.getDjdbcs() + 1);
						baseDao.modify(lsDbdx, "updateDbfs");
					}else{
						log.log(Priority.ERROR, "保证金操作失败code：" + callPMap.getRetCode() + " ret:" + callPMap.getRetMsg());
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.log(Priority.ERROR, "点播短信下发：" + e.getMessage());
		}
	}
	
	private LsDbdx checkIsUsefull(LsDbdx lsDbdx)
	{
		//判断是否失效
		Long yxsj = Long.parseLong(lsDbdx.getYxsj());
		Long sxsj = Long.parseLong(lsDbdx.getSxsj());
		Long now = Long.parseLong(DateUtils.strDate("yyyyMMddHHmmss"));
		if(now < yxsj && now > sxsj)
		{
			//短信已经失效
			if(lsDbdx.getDbsxhf() != null && !"".equals(lsDbdx.getDbsxhf()))
			{
				lsDbdx.setHfnr(lsDbdx.getDbsxhf());
			}else{
				lsDbdx.setHfnr(null);
			}
		}
		//判断是否超过点击次数
		if(lsDbdx.getDjdbcs() != 0 && lsDbdx.getZdbcs() != 0 && lsDbdx.getDjdbcs() >= lsDbdx.getZdbcs())
		{
			//超过点击次数
			if(lsDbdx.getCgcshf() != null && !"".equals(lsDbdx.getCgcshf()))
			{
				lsDbdx.setHfnr(lsDbdx.getCgcshf());
			}else{
				lsDbdx.setHfnr(null);
			}
		}
		return lsDbdx;
	}
}

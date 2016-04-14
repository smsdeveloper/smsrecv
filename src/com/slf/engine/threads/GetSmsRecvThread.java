package com.slf.engine.threads;


import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import com.slf.common.client.HttpSqsServiceImpl;
import com.slf.common.client.IHttpSqsService;
import com.slf.engine.base.BaseThread;
import com.slf.engine.base.IBaseDao;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.common.SysContants;
import com.slf.engine.services.IBaseService;
import com.slf.engine.utils.DateUtils;
import com.slf.engine.utils.Factory;

public class GetSmsRecvThread extends BaseThread {

	private static final Logger log = Logger.getLogger(GetSmsRecvThread.class);
	private IHttpSqsService httpSqsService = null;
	public GetSmsRecvThread(ThreadGroup group)
	{
		super(group, "SEND_THREAD" + Thread.currentThread().getId());
		log.log(Priority.INFO, "SEND_THREAD RUN SUCCESS");
		if(httpSqsService == null)
		{
			httpSqsService = new HttpSqsServiceImpl();
		}
	}
	
	@Override
	protected void doBusiness() {
		// TODO Auto-generated method stub
		
		Map<String, String> obj = httpSqsService.getFromSqs(SysContants.HTTPSQS_URL,SysContants.HTTPSQS_NAME,SysContants.HTTPSQS_AUTH);
		if(obj != null && obj.size() > 0)
		{
			log.log(Priority.INFO, "getsms->" + obj.toString());
			LsMosms lsMosms = new LsMosms();
			try {
				BeanUtils.populate(lsMosms, obj);
				lsMosms.setJsrq(DateUtils.strDate("yyyyMMdd"));
				lsMosms.setJssj(DateUtils.strDate("yyyyMMddHHmmss"));
				IBaseService baseService = null;
				Object service = Factory.getInstantBiz("TD" + lsMosms.getTdbh());
				if(service != null)
				{
					baseService = (IBaseService)service;
				}else{
					baseService = (IBaseService) Factory.getInstantBiz("TDCOMMON");
				}
				baseService.addToDb(lsMosms);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				log.log(Priority.ERROR, "数据库插入错误：" + e.getMessage() + " " + obj.toString());
			}
		}else{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
	}
}

package com.slf.engine.services.impl;

import java.sql.SQLException;
import org.apache.log4j.Logger;
import com.slf.common.util.Utils;
import com.slf.engine.base.IBaseDao;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.bo.XxDl;
import com.slf.engine.services.IBaseService;
import com.slf.engine.services.helper.ServiceHelper;
import com.slf.engine.utils.Factory;

public class HaoyitongServiceImpl extends BaseService implements IBaseService{

	private static final Logger log = Logger.getLogger(HaoyitongServiceImpl.class);
	@Override
	public void addToDb(LsMosms lsMosms) throws SQLException {
		// TODO Auto-generated method stub
		lsMosms.setJshm(Utils.replaceString(lsMosms.getJshm()));
		IBaseDao baseDao = (IBaseDao) Factory.getInstantBiz("baseDao");		
		XxDl xxDl = new XxDl();
		xxDl.setZhm(ServiceHelper.getDlFph(lsMosms.getJsh()));
		xxDl = (XxDl)baseDao.getObject(xxDl, "checkDlzhm");
		if(xxDl != null)
		{
			lsMosms.setDlid(xxDl.getDlid());
			baseDao.add(lsMosms, "addMoSms");
//			this.sendDbDx(lsMosms, xxDl);
		}
	}
}

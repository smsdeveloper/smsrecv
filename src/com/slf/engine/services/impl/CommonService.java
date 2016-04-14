package com.slf.engine.services.impl;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.slf.engine.base.IBaseDao;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.services.IBaseService;
import com.slf.engine.utils.Factory;

public class CommonService implements IBaseService {

	private static final Logger log = Logger.getLogger(CommonService.class);
	
	@Override
	public void addToDb(LsMosms lsMosms) throws SQLException {
		IBaseDao baseDao = (IBaseDao) Factory.getInstantBiz("baseDao");	
		baseDao.add(lsMosms, "addCommonMoSms");
	}

}

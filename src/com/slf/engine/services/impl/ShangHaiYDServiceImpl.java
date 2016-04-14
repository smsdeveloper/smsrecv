package com.slf.engine.services.impl;
import java.sql.SQLException;

import com.slf.common.util.Utils;
import com.slf.engine.base.IBaseDao;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.services.IBaseService;
import com.slf.engine.utils.Factory;

public class ShangHaiYDServiceImpl  implements IBaseService{

	@Override
	public void addToDb(LsMosms lsMosms) throws SQLException {
		lsMosms.setJshm(Utils.replaceString(lsMosms.getJshm()));
		IBaseDao baseDao = (IBaseDao) Factory.getInstantBiz("baseDao");
		baseDao.add(lsMosms, "addCommonMoSms");
	}	
}

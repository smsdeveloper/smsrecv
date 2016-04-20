package com.slf.engine.services.impl;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.slf.common.util.Utils;
import com.slf.engine.base.IBaseDao;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.bo.XxDl;
import com.slf.engine.common.SysContants;
import com.slf.engine.services.IBaseService;
import com.slf.engine.services.helper.ServiceHelper;
import com.slf.engine.utils.Factory;

public class WenZhouYDServiceImpl extends BaseService implements IBaseService {

	private static final Logger LOGGER = Logger.getLogger(WenZhouYDServiceImpl.class);

	@Override
	public void addToDb(LsMosms lsMosms) throws SQLException {
		lsMosms.setJshm(Utils.replaceString(lsMosms.getJshm()));
		IBaseDao baseDao = (IBaseDao) Factory.getInstantBiz("baseDao");
		XxDl xxDl = new XxDl();

		// 判断是否做过接入号替换
		String jsh = lsMosms.getJsh();
		if (jsh.length() > SysContants.ZHM_LEN) {
			String zhm = jsh.substring(0, SysContants.ZHM_LEN);
			xxDl.setZhm(zhm);
			xxDl = (XxDl) baseDao.getObject(xxDl, "checkDljrhppbz");
			if (xxDl == null) {
				xxDl = new XxDl();
				xxDl.setZhm(ServiceHelper.getDlFph(jsh));
				xxDl = (XxDl) baseDao.getObject(xxDl, "checkDlzhm");
			}
		} else {
			xxDl.setZhm(ServiceHelper.getDlFph(jsh));
			xxDl = (XxDl) baseDao.getObject(xxDl, "checkDlzhm");
		}

		if (xxDl != null) {
			lsMosms.setDlid(xxDl.getDlid());
			baseDao.add(lsMosms, "addMoSms");

			// this.sendDbDx(lsMosms, xxDl);
		}
	}
}

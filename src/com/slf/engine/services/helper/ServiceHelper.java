package com.slf.engine.services.helper;

import org.apache.commons.lang.RandomStringUtils;
import com.slf.engine.bo.CallPMap;
import com.slf.engine.bo.LsDbdx;
import com.slf.engine.bo.LsMosms;
import com.slf.engine.bo.XxDl;
import com.slf.engine.utils.DateUtils;

public class ServiceHelper {

	public static String getDlFph(String str)
	{
		if(!str.startsWith("0"))
		{
			//接口代理
			str = str.substring(0, 2);
		}
		return str;
	}
	
	/*
	 * 插入一条新生支付存款请求
	 */
	public static CallPMap makebzj(XxDl xxDl,LsDbdx lsDbdx,LsMosms lsMosms)
	{
		String smsMsg = lsDbdx.getHfnr();
		CallPMap map = new CallPMap();
		map.put("DLID", xxDl.getDlid());
		map.put("DXNR", smsMsg);
		map.put("HMSL", 1);
		int smslen = smsMsg.length();
		if(smslen > 70 && xxDl.getNrzs().intValue() > 67) //采用网关长短信算法
		{
			smslen += (xxDl.getNrzs().intValue() - 67) * (smslen%67 == 0 ?  smslen/67 : smslen/67 + 1);
		}
		map.put("DXZS", smslen);
		map.put("JRBZ", "h");
		map.put("DLFLSH", DateUtils.strDate("ddHHmmss") + RandomStringUtils.randomNumeric(4));
		map.put("MBBZ", "0");
		map.put("DSFSSJ",  DateUtils.strDate("yyyyMMddHHmmss"));
		return map;
	}
}

package com.slf.engine.bo;

import java.util.HashMap;

import com.slf.engine.common.SysContants;

/**
 * <p>Title: NEWLINE</p>
 *
 * <p>Copyright: Copyright (c) 2008</p>
 *
 * <p>Company: 杭州正和科技有限公司(Z)</p>
 *
 * @author 孙立凡,eghostsun@gmail.com
 * @version 1.0
 */

public class CallPMap extends HashMap<String, Object>{

	public CallPMap()
	{
		this.put("retCode", 0);
		this.put("retMsg", "");
		this.put("tableUser", SysContants.ORACLE_TABLEUSER);
	}
	
	public Integer getRetCode()
	{
		if(null == this.get("retCode"))
		{
			this.put("retCode", 0);
		}
		return (Integer) this.get("retCode");
	}
	public String getRetMsg()
	{
		return ((String) this.get("retMsg")).replace("\"", "\\\"");
	}
	
	public boolean isSuccess()
	{
		return this.containsKey("retCode") && this.getRetCode().intValue() == 1;
	}
}

package com.slf.engine.common;

import com.slf.common.util.ReadProperties;



public class SysContants {

	public static final String CONFIG_FILE_NAME = "conf/config.properties";
	
	public static final int MAX_TASKNUM = Integer.parseInt(ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("max.tasknum"));
	public static final String DEFAULT_CHARSET = "utf-8";
	public static final String ORACLE_TABLEUSER = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("ORACLE.TABLEUSER");
	
	public static final String HTTPSQS_URL = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("httpsqs.url");
	public static final String HTTPSQS_NAME = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("httpsqs.name");
	public static final String HTTPSQS_AUTH = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("httpsqs.auth");
	
	public static final String SMS_URL = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("sms.url");
	public static final String SMS_NAME = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("sms.name");
	public static final String SMS_AUTH = ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("sms.auth");
	
	public static final int ZHM_LEN = Integer.parseInt(ReadProperties.getProp(CONFIG_FILE_NAME).getProperty("zhm.len"));
}

package com.slf.engine.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * * spring实例化工厂类，用于实例化spring管理的bean *
 * 
 * @author lifan sun
 */
public class Factory {
	private static ApplicationContext ctx = null;

	public synchronized static Object getInstantBiz(String bizName) {
		if (null == ctx) {
			ctx = new FileSystemXmlApplicationContext(
					"conf/applicationContext.xml");
		}
		if(ctx.containsBean(bizName))
		{
			return ctx.getBean(bizName);
		}else{
			return null;
		}
	}
}
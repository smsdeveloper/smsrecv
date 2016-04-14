package com.slf.engine.common;

import java.util.concurrent.atomic.AtomicInteger;


public class SysContext {

	public static boolean IS_START = false; //服务是否开启
	public static AtomicInteger THREAD_NUM  = new AtomicInteger(0);
//	public static ThreadGroup GET_THREAD_GROUP = new ThreadGroup("THREAD_GROUP");
	public static ThreadGroup SEND_THREAD_GROUP = new ThreadGroup("THREAD_GROUP");
}

package com.slf.engine.base;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import com.slf.engine.common.SysContext;

public abstract class BaseThread extends Thread {

	private static final Logger log = Logger.getLogger(BaseThread.class);
	public BaseThread(ThreadGroup group, String string) {
		// TODO Auto-generated constructor stub
		super(group, string);
	}
	
	public BaseThread()
	{}
	public void run()
	{
		while(true)
		{
			doReady();
			if(SysContext.IS_START)
			{
				synchronized (SysContext.THREAD_NUM) {
					SysContext.THREAD_NUM.getAndIncrement();
				}
				
				doBusiness();
				synchronized (SysContext.THREAD_NUM) {
					SysContext.THREAD_NUM.getAndDecrement();
				}
			}else{
				try {
					log.log(Priority.INFO, "system is close wait open->3秒钟后重试");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			}
		}
	}
	protected abstract void doBusiness(); //业务操作

	/**
	 * 准备工作
	 */
	protected void doReady(){
		
	} 
}

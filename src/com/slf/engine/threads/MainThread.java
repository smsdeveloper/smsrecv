package com.slf.engine.threads;



import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import com.slf.engine.base.BaseThread;
import com.slf.engine.common.SysContants;
import com.slf.engine.common.SysContext;

public class MainThread extends BaseThread {

	private static final Logger log = Logger.getLogger(MainThread.class);
	public MainThread()
	{
		SysContext.IS_START = true;
		log.log(Priority.INFO, "主线程启动");
	}
	
	@Override
	protected void doBusiness() {
		// TODO Auto-generated method stub
		//上游服务连接成功
		synchronized (SysContext.SEND_THREAD_GROUP) {
			while(SysContext.SEND_THREAD_GROUP.activeCount() < SysContants.MAX_TASKNUM)
			{
				log.log(Priority.INFO, "当前交易线程数【" + SysContext.SEND_THREAD_GROUP.activeCount() + "】");
				GetSmsRecvThread sendThread = new GetSmsRecvThread(SysContext.SEND_THREAD_GROUP);
				sendThread.start();
			}
		}
		try {
			Thread.sleep(10000); //10秒钟监控一次线程状态
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}

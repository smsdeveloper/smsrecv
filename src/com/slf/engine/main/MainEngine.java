package com.slf.engine.main;

import org.apache.log4j.Logger;

import com.slf.engine.threads.MainThread;
public class MainEngine {

	private static final Logger log = Logger.getLogger(MainEngine.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainThread().start();
	}

}

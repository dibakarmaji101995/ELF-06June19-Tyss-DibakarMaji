package com.tyss.corejava.multithreading;

import java.util.logging.Logger;

public class MyThread5 implements Runnable{
	private static final Logger logger=Logger.getLogger("MyThreadLogger");
	String name;
	public MyThread5(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		logger.info(name+"---->started");
		for (Integer i = 0; i < 10; i++) {
			logger.info(name+" "+i.toString());
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
		logger.info(name+"---->stoped");
	}

}

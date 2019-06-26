package com.tyss.corejava.multithreading;

import java.util.logging.Logger;

public class MyThread2 extends Thread{
	private static final Logger logger=Logger.getLogger("MyThreadLogger");
    @Override
    public void run() {
    	for (Integer i = 0; i < 10; ++i) {
			logger.info(i.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				logger.info(e.getMessage());
			}
		}
    }
}

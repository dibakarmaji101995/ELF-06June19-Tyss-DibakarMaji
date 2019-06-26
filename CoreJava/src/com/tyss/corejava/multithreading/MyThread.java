package com.tyss.corejava.multithreading;

import java.util.logging.Logger;

public class MyThread extends Thread{
	private static final Logger logger=Logger.getLogger("MyThreadLogger");
    @Override
    public void run() {
    	logger.info("MyThread.run()");
    }
}

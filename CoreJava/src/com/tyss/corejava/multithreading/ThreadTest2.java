package com.tyss.corejava.multithreading;

import java.util.logging.Logger;

public class ThreadTest2 {
	private static final Logger logger = Logger.getLogger("MyThreadLogger");

	public static void main(String[] args) {

		logger.info("main() start");
		// create MyThread object
		MyThread2 mt = new MyThread2();
		mt.setName("t1");
		mt.start();
		// create MyThread object
		MyThread2 mt1 = new MyThread2();
		mt1.setName("t2");
		mt1.start();

		try {
			mt.join();
		} catch (InterruptedException e) {

			logger.info(e.getMessage());
		}

		logger.info("main() stop");

	}

}

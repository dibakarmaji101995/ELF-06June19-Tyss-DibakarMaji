package com.tyss.corejava.multithreading;

import java.util.logging.Logger;

public class ThreadTest1 {
	private static final Logger logger = Logger.getLogger("MyThreadLogger");

	public static void main(String[] args) {

		logger.info("main() start");
		// create MyThread object
		MyThread mt = new MyThread();
		mt.start();
		// create MyThread object
		MyThread mt1 = new MyThread();
		mt1.start();

		/*
		 * for (Integer i = 0; i < 50; ++i) { logger.info(i.toString()); try {
		 * Thread.sleep(1000); } catch (InterruptedException e) {
		 * logger.info(e.getMessage()); } }
		 */

		try {
			mt.join();
		} catch (InterruptedException e) {

			logger.info(e.getMessage());
		}

		logger.info("main() stop");

	}

}

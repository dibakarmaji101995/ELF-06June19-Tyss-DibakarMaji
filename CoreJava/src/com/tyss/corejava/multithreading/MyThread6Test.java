package com.tyss.corejava.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.logging.Logger;

public class MyThread6Test {
	private static final Logger logger = Logger.getLogger("MyThreadLogger");

	public static void main(String[] args) {
		Integer result = null;
		MyThread6 m = new MyThread6();

		FutureTask<Integer> ft = new FutureTask<Integer>(m);

		Thread t = new Thread(ft);
		t.start();

		try {
			result = ft.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info(result.toString());
	}
}

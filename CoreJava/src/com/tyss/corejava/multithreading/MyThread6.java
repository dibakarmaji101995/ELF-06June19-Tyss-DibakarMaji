package com.tyss.corejava.multithreading;

import java.util.concurrent.Callable;

public class MyThread6 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		return 120;
	}

}

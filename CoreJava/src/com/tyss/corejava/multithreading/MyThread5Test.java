package com.tyss.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread5Test {
    public static void main(String[] args) {
		MyThread5 m1=new MyThread5("first");
		MyThread5 m2=new MyThread5("second");
		MyThread5 m3=new MyThread5("third");
		MyThread5 m4=new MyThread5("fourth");
		MyThread5 m5=new MyThread5("fifth");
		
		ExecutorService service=Executors.newFixedThreadPool(2);
		
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);
		//close the service
		service.shutdown();
	}
}

package com.tyss.corejava.multithreading;

public class MyThread4Test {
    public static void main(String[] args) {
		MyThread4 m=new MyThread4();
		Thread t=new Thread(m);
		t.start();
	}
}

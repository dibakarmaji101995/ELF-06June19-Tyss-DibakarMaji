package com.tyss.corejava.methodreference;


public class Testing {

	public static void main(String[] args) {
		 MyFunctionalInterface mfi=new MyFunctionalInterfaceTest()::add;
//		MyFunctionalInterface mfi = MyFunctionalInterfaceTest::add;
		Integer result = mfi.apply(10, 20);
		System.out.println(result);
	}
}

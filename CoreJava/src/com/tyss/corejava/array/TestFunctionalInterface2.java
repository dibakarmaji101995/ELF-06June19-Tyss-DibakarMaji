package com.tyss.corejava.array;

public class TestFunctionalInterface2 {

	public static void main(String[] args) {
		MyFunctionalInterface mfi=(a,b)-> a+b;
		int sum=mfi.add(5,1);
		System.out.println("sum::"+sum);

	}


}

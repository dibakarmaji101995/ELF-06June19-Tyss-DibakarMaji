package com.tyss.corejava.methodreference;

public class FactorialTest {
	public static void main(String[] args) {
          MyFunctionalInterface7 mfi=new Calculator() :: factorial;
          Integer result= mfi.fact(10);
          System.out.println("Factorial is::"+result);
	}
}

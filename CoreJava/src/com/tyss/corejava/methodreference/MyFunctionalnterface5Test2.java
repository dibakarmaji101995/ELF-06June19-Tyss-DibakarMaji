/*
 * 
 */
package com.tyss.corejava.methodreference;

/**
 * 
 * @author Administrator
 *
 */
public class MyFunctionalnterface5Test2 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
		MyFunctionalInterfce5 mfi=Calculator :: add;
		Integer result=mfi.get(10,20);
		System.out.println("Sum is "+result);
		
		MyFunctionalInterfce6 mfi1=new Calculator() :: avg;
		Double avg=mfi1.get(20,30);
		System.out.println("Avg is::"+avg);
	}
}

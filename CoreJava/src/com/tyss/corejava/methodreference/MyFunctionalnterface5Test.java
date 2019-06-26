package com.tyss.corejava.methodreference;

public class MyFunctionalnterface5Test {
    public static Integer add(Integer num1,Integer num2) {
    	return num1+num2;
    }
    
    public static void main(String[] args) {
		MyFunctionalInterfce5 mfi=MyFunctionalnterface5Test :: add;
		Integer result=mfi.get(10,20);
		System.out.println(result);
	}
}

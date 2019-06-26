package com.tyss.corejava.methodreference;

public class Calculator {
    public static Integer add(Integer num1,Integer num2) {
    	return num1+num2;
    }
    public Double avg(Integer num1,Integer num2) {
    	return (num1+num2)/2.0;
    }
    public Integer factorial(Integer num) {
    	int f=1;
    	for(int i=1;i<=num;++i) {
    		f=f*i;
    	}
    	return f;
    }
}

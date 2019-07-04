package com.tyss.corejava.singleton;

public class SingletonEnumTest {
    public static final SingletonEnum singleton=SingletonEnum.INSTANCE;
    
    public static void main(String[] args) {
    	
    	singleton.setValue(10);
    	System.out.println(singleton.getValue());
	}
}

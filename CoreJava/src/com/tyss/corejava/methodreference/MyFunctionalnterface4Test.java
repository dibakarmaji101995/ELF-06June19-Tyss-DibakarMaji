package com.tyss.corejava.methodreference;

public class MyFunctionalnterface4Test {
    public static void open() {
    	System.out.println("MyFunctionalnterface4Test.open()");
    }
    
    public static void main(String[] args) {
		MyFunctionalInterfce4 mfi=MyFunctionalnterface4Test :: open;
		mfi.remove();
	}
}

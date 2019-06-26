package com.tyss.corejava.methodreference;

public class Testing3 {
	public static void main(String[] args) {
     //    MyFunctionalInterface3 mfi=String:: toUpperCase;
		MyFunctionalInterface3 mfi=Integer::parseInt;
         System.out.println(mfi.apply("100000"));
	}
}

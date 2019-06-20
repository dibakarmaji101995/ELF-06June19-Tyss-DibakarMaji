package com.tyss.corejava.array;
interface Add{
	int add(int a,int b);
}
public class TestFunctionalInterface {
	

	public static void main(String[] args) {
		Add f=  (a,b) -> {
			return a+b;
		};
		int add=f.add(5,10);
		System.out.println("Sum::"+add);
	}


}

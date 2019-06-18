package com.tyss.corejava.sample;

public class Test {
	String name;
	String addrs;

	public void add() {
		// this is empty method
		String str = "abc";
		System.out.println(str);
	}

	public static void main(String[] args) {
		Sample.add();
		System.out.println(Sample.STR.compareTo("123"));

	}

	public void m1() {
		String str = "abc";
		System.out.println(str);
	}

	public void m2() {
		String str = "abc";
		System.out.println(str);
	}

}

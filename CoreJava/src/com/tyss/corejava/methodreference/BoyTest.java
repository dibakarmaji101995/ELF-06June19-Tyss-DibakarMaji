package com.tyss.corejava.methodreference;

public class BoyTest {
    public static void main(String[] args) {
		MyBoy b=Boy::new;
		Boy boy=b.getBoy("diba",20,5.9);
		System.out.println(boy);
	}
}

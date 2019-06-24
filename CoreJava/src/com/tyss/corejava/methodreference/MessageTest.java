package com.tyss.corejava.methodreference;

public class MessageTest {
     public static void main(String[] args) {
		MyFunctionalInterface2 mfi=Message::new;
		Message msgObject=mfi.getMessage("Hello");
		System.out.println(msgObject.hashCode());
	}
}

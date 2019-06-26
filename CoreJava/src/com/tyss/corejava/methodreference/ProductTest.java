package com.tyss.corejava.methodreference;

public class ProductTest {
    public static void main(String[] args) {
		MyProduct p=Product::new;
		Product prod=p.getProduct("tv",24510.0);
		System.out.println(prod);
	}
}

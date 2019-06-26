package com.tyss.corejava.methodreference;

public class Product {
     private String productName;
     private Double price;
	public Product(String productName, Double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}
     
}

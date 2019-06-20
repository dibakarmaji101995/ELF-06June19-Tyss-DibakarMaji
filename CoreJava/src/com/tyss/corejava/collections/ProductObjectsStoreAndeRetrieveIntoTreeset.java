package com.tyss.corejava.collections;

import java.util.Set;
import java.util.TreeSet;

public class ProductObjectsStoreAndeRetrieveIntoTreeset {

	public static void main(String[] args) {
		Set<Product> ts=null;
		// create TreeSet Object
        ts=new TreeSet<>();
        //add ostudent objects to ts
        ts.add(new Product("tv", 20000, 5.8));
        ts.add(new Product("mobile",15000,8.0));
        ts.add(new Product("ac",30000, 7.5));

		// retrieve student objects from al object
        ts.forEach(prod -> {
			System.out.println(prod);
		});

	}

}

package com.tyss.corejava.collections;

import java.util.Set;
import java.util.TreeSet;

public class CarsObjectsStoreAndeRetrieveIntoTreeset {

	public static void main(String[] args) {
		Set<Car> ts=null;
		// create TreeSet Object
        ts=new TreeSet<>();
        //add ostudent objects to ts
        ts.add(new Car("C-CLAS","BMV", 2000000.0, 5.8));
        ts.add(new Car("S-BENZ","Marcedise",15000000.0,8.0));
        ts.add(new Car("A-4","AUDI",30000000.0, 7.5));

		// retrieve student objects from al object
        ts.forEach(prod -> {
			System.out.println(prod);
		});

	}

}

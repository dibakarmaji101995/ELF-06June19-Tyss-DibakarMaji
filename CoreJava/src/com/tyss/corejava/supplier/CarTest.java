package com.tyss.corejava.supplier;

import java.util.Arrays;
import java.util.function.Supplier;

public class CarTest {
	public static void main(String[] args) {
//		Supplyer<Car> s=()-> new Car(10);
		Supplier<Car> s=()-> new Car(10);
	    Car c=s.get();
	    System.out.println(c.getFuelCapacity());
	}
}

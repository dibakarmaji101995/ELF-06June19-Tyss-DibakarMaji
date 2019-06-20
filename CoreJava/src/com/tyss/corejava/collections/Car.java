package com.tyss.corejava.collections;

import lombok.Data;

@Data
public class Car implements Comparable<Car>{
	private String name;
	private String brand;
	private Double cost;
	private Double rating;

	public Car(String name, String brand, Double cost, Double rating) {
		super();
		this.name = name;
		this.brand = brand;
		this.cost = cost;
		this.rating = rating;
	}

	@Override
	public int compareTo(Car o) {
		return this.name.compareTo(o.name);
	}

}

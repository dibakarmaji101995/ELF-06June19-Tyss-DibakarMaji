package com.tyss.beans;

public class Car {
	private Engine engine;

	

	public Car(Engine engine) {
		this.engine = engine;
	}



	public String getCarDetails() {
		return "car has " + engine.getName();
	}

}

 package com.tyss.beans;

public class Car {
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getCarDetails() {
		return "car has " + engine.getName();
	}

}

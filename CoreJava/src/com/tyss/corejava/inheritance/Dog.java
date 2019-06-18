package com.tyss.corejava.inheritance;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Dog.sound()");

	}

	@Override
	public Float div(Float a, Float b) {
		System.out.println("Dog.div()");
		return a/b;
	}

}

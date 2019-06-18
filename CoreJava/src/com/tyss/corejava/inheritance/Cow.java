package com.tyss.corejava.inheritance;

public class Cow extends Animal {

	@Override
	public void sound() {
		System.out.println("Cow.sound()");

	}

	@Override
	public Float div(Float a, Float b) {
		return a/b;
	}

}

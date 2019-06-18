package com.tyss.corejava.inheritance;

public class Test {
	public static void main(String[] args) {
		Animal animal=null;
         //create cow object
		animal=new Cow();
		//invoke cow class method
		animal.sound();
		animal.div(10.0f,3.0f);
		//create dog class object
		animal=new Dog();
		animal.sound();
		animal.div(56.0f,2.0f);
		
	}
}

package com.tyss.corejava.multithreading;

public class AnimalTest {
	public static void main(String[] args) {

		Cow c = new Cow();

		Animal t1 = new Animal(c);
		Animal t2 = new Animal(c);
		Animal t3 = new Animal(c);

		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.toDo();
		
	}

}

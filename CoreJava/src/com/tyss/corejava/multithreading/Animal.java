package com.tyss.corejava.multithreading;

public class Animal extends Thread{
	Cow ref;
	public Animal(Cow c) {
		this.ref=c;
	}
     @Override
    public void run() {
       ref.eat(this);	
    }
}

package com.tyss.assessment.animalsound;

public class AnimalFactory {
    public static Animal getInstance(String className) {
    	if(className.equals("Cow")) {
    		return new Cow();
    	}else if(className.equals("Dog")) {
    		return new Dog();
    	}else {
    		return null;
    	}
    	
    }
}

package com.tyss.corejava.methodreference;

public class Boy {
    private String name;
    private Integer age;
    private Double height;
    
	public Boy(String name, Integer age, Double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Boy [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
    
}

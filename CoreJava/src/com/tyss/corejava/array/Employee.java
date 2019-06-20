package com.tyss.corejava.array;

import lombok.Data;

@Data
public class Employee {
     private String name;
     private Integer age;
     private Double sal;
	public Employee(String name, Integer age, Double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
     
}

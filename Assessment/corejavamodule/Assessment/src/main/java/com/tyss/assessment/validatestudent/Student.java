/*
 * 
 */
package com.tyss.assessment.validatestudent;

import lombok.Data;
/**
 * 
 * @author Administrator
 *
 */
@Data
public class Student {
	/* this is name field */
    private String name;
    /* this is gender field */
    private String gender;
    /* this is age field*/
    private Integer age;
    /*this is percentage field*/
    private Double percentage;
	/**
	 * 4-param constructor for initializing student object
	 * @param name
	 * @param gender
	 * @param age
	 * @param percentage
	 */
	public Student(String name, String gender, Integer age, Double percentage) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.percentage = percentage;
	}
    
}

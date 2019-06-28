/*
 * 
 */
package com.tyss.assessment.countpassfemale;

import lombok.Data;
/**
 * 
 * @author Administrator
 *
 */
@Data
public class Student {
	/*this field for store student name*/
    private String name;
    /*this field for store student gender*/
    private String gender;
    /*this field for store student isPass*/
    private Boolean isPass;
    /**
     * 
     * @param name
     * @param gender
     * @param isPass
     */
	public Student(String name, String gender, Boolean isPass) {
		this.name = name;
		this.gender = gender;
		this.isPass = isPass;
	}
    
}

/*
 * 
 */
package com.tyss.assessment.displayobjectcontent;

import lombok.Data;
/**
 * 
 * @author Administrator
 *
 */
@Data
public class Students {
	/* this field for students name*/
    private String name;
    /* this field for students gender*/
    private String gender;
    /* this field for students isPass*/
    private Boolean isPass;
    /**
     * 
     * @param name
     * @param gender
     * @param isPass
     */
	public Students(String name, String gender, Boolean isPass) {
		this.name = name;
		this.gender = gender;
		this.isPass = isPass;
	}
    
}

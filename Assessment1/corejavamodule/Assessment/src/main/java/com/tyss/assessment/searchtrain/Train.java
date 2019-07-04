/*
 * 
 */
package com.tyss.assessment.searchtrain;

import lombok.Data;
/**
 * This is train entity class
 * @author Administrator
 *
 */
@Data
public class Train {
	 /* this field for store Train name*/
     private String name;
     /*this field for store Train number*/
     private Integer number;
    /**
     * 2-param constructor for initializing train fields 
     * @param name
     * @param number
     */
	public Train(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
	}
	
}

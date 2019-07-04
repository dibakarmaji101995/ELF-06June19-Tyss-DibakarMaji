/*
 * 
 */
package com.tyss.assessment.validatestudent;
/**
 * 
 * @author Administrator
 *
 */
public class StudentNotEligibleException extends RuntimeException {
	/**
	 * 
	 * @param msg
	 */
     public StudentNotEligibleException(String msg) {
		super(msg);
	}
}

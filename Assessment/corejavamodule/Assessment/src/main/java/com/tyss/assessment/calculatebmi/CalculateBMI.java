/*
 * 
 */
package com.tyss.assessment.calculatebmi;
/**
 * 
 * @author Administrator
 *
 */
public class CalculateBMI {
	/**
	 * 
	 * @param weight
	 * @param height
	 * @return
	 */
	public static Double calculateBMI(Double weight, Double height) {
		return weight / (height * height);
	}
}

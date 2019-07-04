/*
 * 
 */
package com.tyss.assessment.calculatebmi;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * 
 * @author Administrator
 *
 */
public class BMITest {
	/* creating logger object*/
	private static final Logger logger = Logger.getLogger("MyLogger");
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=null;
        Double weight=null;
        Double height=null;
		Double result=null;
        //create scanner class object
		sc=new Scanner(System.in);
		//take input from keyboard
		logger.info("Enter Wegiht in kg::");
		weight=sc.nextDouble();
		logger.info("Enter Wegiht in meters::");
		height=sc.nextDouble();
		//invoke claculateBMI method
		result=CalculateBMI.calculateBMI(weight, height);
		logger.info(result.toString());
		//close sc
		sc.close();
	}
}

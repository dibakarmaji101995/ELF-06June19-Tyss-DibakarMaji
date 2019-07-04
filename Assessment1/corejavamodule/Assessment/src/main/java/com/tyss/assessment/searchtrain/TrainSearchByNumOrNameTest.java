/*
 * 
 */
package com.tyss.assessment.searchtrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 * This class is used for testing train search operation
 * @author Administrator
 *
 */
public class TrainSearchByNumOrNameTest {
	/* creating logger object*/
	private static final Logger logger = Logger.getLogger("MyLogger");
	/* declaring list field for store train object */
	private static List<Train>  list;

	static {
		// create ArrayList object
		list = new ArrayList<Train>();
		// add train object to ArrayList object
		list.add(new Train("satabdi", 1234));
		list.add(new Train("vadrak", 1234));
		list.add(new Train("janata", 1234));
	}

	public static void main(String[] args) {
		Scanner sc=null;
		String name=null;
		Integer num=0;
          //search train 
		//create Scanner class object
		sc=new Scanner(System.in);
		//take value from keyboard
		logger.info("Enter Train name and Number::");
		name=sc.next();
		num=sc.nextInt();
		//invoke search method
		logger.info(search(name,num));
	}
	/**
	 * This method is used for searchin train 
	 * @param name
	 * @param num
	 * @return
	 */
	public static  String search(String name,Integer num) {
		for(int i=0;i<list.size();++i) {
			Train train=list.get(i);
			if(train.getName().equals(name) || train.getNumber().equals(num)) {
				return "train "+name+" is founded";
			}
			else {
				return "Train "+name+" is not founded";
			}
		}
		return "Train "+name+" is not founded";
	}

}

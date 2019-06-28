/*
 * 
 */
package com.tyss.assessment.countpassfemale;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

/**
 * 
 * @author Administrator
 *
 */
public class CountPassFemaleTest {
	/* creating logger object*/
	private static final Logger logger = Logger.getLogger("MyLogger");
	/* declaring list field for store train object */
	private static List<Student>  list;

	static {
		// create ArrayList object
		list = new ArrayList<Student>();
		// add train object to ArrayList object
		list.add(new Student("swatha","f",true));
		list.add(new Student("raju","m",true));
		list.add(new Student("anikita","f",false));
		list.add(new Student("anamika","f",true));
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	Long count=list.stream().filter(t-> t.getGender().equals("f") && t.getIsPass().equals(true)).count();
     logger.info(count.toString());
	}


}

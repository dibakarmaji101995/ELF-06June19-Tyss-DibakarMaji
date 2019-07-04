/*
 * 
 */
package com.tyss.assessment.validatestudent;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 * 
 * @author Administrator
 *
 */
public class StudentValidationCheckTest {
	/* creating logger object and store into logger field*/
	private static final Logger logger = Logger.getLogger("MyLogger");
	/* declaring list field for store train object */
	private static List<Student>  list;

	static {
		// create ArrayList object
		list = new ArrayList<Student>();
		// add train object to ArrayList object
		list.add(new Student("swatha","f",15,62.0));
		list.add(new Student("raju","m",16,70.0));
		list.add(new Student("anikita","f",16,75.0));
		list.add(new Student("anamika","f",17,80.0));
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	    //validate student
		for(int i=0;i<list.size();++i) {
			Student stud=list.get(i);
			//invoke validate method
			String result=validate(stud);
			logger.info(result);
		}
	}
	/**
	 * 
	 * @param stud
	 * @return
	 */
	public static String validate(Student stud) {
		if(stud.getAge()>=15 && stud.getAge()<19 && stud.getPercentage()>=60) {
			return stud.getName()+" you are elegible for examination";
		}
		else {
			throw new StudentNotEligibleException(stud.getName()+" you are not elegible for examination");
		}
	}

}

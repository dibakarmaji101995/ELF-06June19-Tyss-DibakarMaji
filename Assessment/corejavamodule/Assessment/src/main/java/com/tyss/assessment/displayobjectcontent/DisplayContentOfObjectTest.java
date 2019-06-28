/*
 * 
 */
package com.tyss.assessment.displayobjectcontent;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 * 
 * @author Administrator
 *
 */
public class DisplayContentOfObjectTest {
	/* creating logger object*/
	private static final Logger logger = Logger.getLogger("MyLogger");
	/* declaring list field for store train objects */
	private static List<Students>  list;

	static {
		// create ArrayList object
		list = new ArrayList<Students>();
		// add train object to ArrayList object
		list.add(new Students("swatha","f",true));
		list.add(new Students("raju","m",true));
		list.add(new Students("anikita","f",false));
		list.add(new Students("anamika","f",true));
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		list.forEach(stud->
			logger.info(stud.toString())
		);
	}
	
}

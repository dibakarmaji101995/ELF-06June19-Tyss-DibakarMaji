package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListTest13 {
    private static final Logger logger=Logger.getLogger("ARLogger");
	public static void main(String[] args) {
		List<Integer> al = null;
		// create ArrayList Object
		al = new ArrayList<Integer>();
		// add value to ArrayList object
		al.add(10);
		al.add(9);
		al.add(8);
		al.add(7);
		al.add(6);
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
		
	    System.out.println("999999999999999999999999999999");
	    al.stream().forEach(i->logger.info(i.toString()));
	    
	    String s=al.stream().sorted().collect(Collectors.toList()).toString();
	    logger.info(s);
	    
	    Comparator<Integer> c=(i,j)->i.compareTo(j);
	    Integer min=al.stream().min(c).get();
	    logger.info(min.toString());
	    
	    Integer max=al.stream().max(c).get();
	    logger.info(max.toString());
	    
	    Stream stream=Stream.of(al);
	   stream.forEach(i->logger.info(i.toString()));
	   
	   Stream<Integer> st=Stream.of(2,4,3,6);
	   st.forEach(i->logger.info(i.toString()));
	    
	    
	}

}

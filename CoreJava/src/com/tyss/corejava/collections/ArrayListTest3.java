package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {
		   List<Object> al=null;
			// create LinkedList object
	       al=new ArrayList<Object>();
	       //add objects into LinkedList object
	       al.add("dibakar");
	       al.add(1);
	       al.add(3);
	       al.add(52);
	       System.out.println("Before----->"+al);
	        
	       al.set(2,23);
	       
	       
	       System.out.println("After----->"+al);
		}
}


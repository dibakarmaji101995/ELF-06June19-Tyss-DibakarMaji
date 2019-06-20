package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest4 {
	public static void main(String[] args) {
		   List<Integer> al=null;
			// create LinkedList object
	       al=new ArrayList<Integer>();
	       //add objects into LinkedList object
	       al.add(3);
	       al.add(1);
	       al.add(3);
	       al.add(52);
	       System.out.println("Before----->"+al);
	       
	       al.sort(Collections.reverseOrder());
	       
	       System.out.println("After----->"+al);
		}
}


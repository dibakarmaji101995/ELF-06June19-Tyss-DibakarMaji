package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {
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
	       
	       Integer in=al.remove(1);
	       System.out.println("Remove object is::"+in);
	       
	       System.out.println("After----->"+al);
		}
}

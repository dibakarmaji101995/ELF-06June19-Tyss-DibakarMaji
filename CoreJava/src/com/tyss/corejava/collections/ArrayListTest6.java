package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest6 {
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
	       
	     boolean result=al.remove((Integer)3);
	     System.out.println("Result::"+result);
	       
	       System.out.println("After----->"+al);
		}
}

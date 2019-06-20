package com.tyss.corejava.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		List v=null;
		// create LinkedList object
       v=new Vector ();
       //add objects into LinkedList object
       v.add(3);
       v.add(1);
       v.add(3);
       v.add(52);
       //retrieve all elements from ll object
       System.out.println(v);
       System.out.println("+++++++++++++++++++");
       //insert new element to ll object
       v.add(1,600);
       
       System.out.println(v);
       System.out.println("----------------------------");
		for (int i = 0; i < v.size(); ++i) {
			System.out.println(v.get(i));
		}
		System.out.println("--------------------------");
		for (Object obj : v) {
			System.out.println(obj.toString());
		}
		System.out.println("---------------------------");
		v.forEach(obj -> {
			System.out.println(obj.toString());
		});
		System.out.println("================================");
		Iterator it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================================");
		ListIterator lit = v.listIterator(v.size());
/*		while (lit.hasNext()) {
			System.out.println(lit.next());
		}  */
		System.out.println("+++++++++++++++++++++++++++++++");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("================================");
		Enumeration enu = ((Vector) v).elements();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

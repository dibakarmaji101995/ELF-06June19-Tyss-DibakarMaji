package com.tyss.corejava.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		List ll=null;
		// create LinkedList object
       ll=new LinkedList();
       //add objects into LinkedList object
       ll.add("dibakar");
       ll.add(1);
       ll.add(3);
       ll.add(52);
       //retrieve all elements from ll object
       System.out.println(ll);
       System.out.println("+++++++++++++++++++");
       //insert new element to ll object
       ll.add(1,600);
       
       System.out.println(ll);
       System.out.println("----------------------------");
		for (int i = 0; i < ll.size(); ++i) {
			System.out.println(ll.get(i));
		}
		System.out.println("--------------------------");
		for (Object obj : ll) {
			System.out.println(obj.toString());
		}
		System.out.println("---------------------------");
		ll.forEach(obj -> {
			System.out.println(obj.toString());
		});
		System.out.println("================================");
		Iterator it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================================");
		ListIterator lit = ll.listIterator(ll.size());
/*		while (lit.hasNext()) {
			System.out.println(lit.next());
		}  */
		System.out.println("+++++++++++++++++++++++++++++++");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}

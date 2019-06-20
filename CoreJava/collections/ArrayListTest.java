package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		List al = null;
		// create ArrayList Object
		al = new ArrayList();
		// add value to ArrayList object
		al.add("diba");
		al.add(1);
		al.add(5);
		al.add('d');
		// retrive all elements
		System.out.println(al);
		System.out.println("----------------------------");
		for (int i = 0; i < al.size(); ++i) {
			System.out.println(al.get(i));
		}
		System.out.println("--------------------------");
		for (Object obj : al) {
			System.out.println(obj.toString());
		}
		System.out.println("---------------------------");
		al.forEach(obj -> {
			System.out.println(obj.toString());
		});
		System.out.println("================================");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================================");
		ListIterator lit = al.listIterator(al.size());
/*		while (lit.hasNext()) {
			System.out.println(lit.next());
		}  */
		System.out.println("+++++++++++++++++++++++++++++++");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}

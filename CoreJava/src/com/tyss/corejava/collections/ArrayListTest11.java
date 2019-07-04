package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ArrayListTest11 {
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
		System.out.println("000000000000000000000000000000");
	    al.stream().filter(l ->l>0).forEach(el->{
	    	logger.info(el.toString());
	    });
	    System.out.println("999999999999999999999999999999");
	    String result=al.stream().filter(l->l>0).collect(Collectors.toList()).toString();
	    logger.info(result);
	    System.out.println("101010101010101010101010000000000");
	    String res=al.stream().filter(l->l%2!=0).collect(Collectors.toList()).toString();
	    logger.info(res);
	    String res1=al.stream().filter(l->l%3==0).collect(Collectors.toList()).toString();
	    logger.info(res1);
	    String res2=al.stream().map(i->i*2).collect(Collectors.toList()).toString();
	    logger.info(res2);
	    Long res3=al.stream().filter(l->l%2!=0).count();
	    logger.info(res3.toString());
	    String s=al.stream().sorted().collect(Collectors.toList()).toString();
	    logger.info(s);
	}

}

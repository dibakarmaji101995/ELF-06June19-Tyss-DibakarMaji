package com.tyss.corejava.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		Set<Integer> hs=null;
		//create HashSet Object
        hs=new TreeSet<Integer>();
        //add elements to HashSet Object
        hs.add(89);
        hs.add(1);
        hs.add(56);
        hs.add(32);
        //retrive elements from hs
        System.out.println(hs);
        
        System.out.println("--------------------------");
		for (Object obj : hs) {
			System.out.println(obj.toString());
		}
		System.out.println("---------------------------");
		hs.forEach(obj -> {
			System.out.println(obj.toString());
		});
	}

}


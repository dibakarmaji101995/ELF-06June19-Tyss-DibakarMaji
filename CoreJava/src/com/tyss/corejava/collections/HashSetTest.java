package com.tyss.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set hs=null;
		//create HashSet Object
        hs=new HashSet();
        //add elements to HashSet Object
        hs.add("diba");
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

package com.tyss.corejava.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String,Object> hm=null;
		//create hm object
        hm=new LinkedHashMap<>();
        //add value to hm object
        hm.put("one",1);
        hm.put("two",2);
        hm.put("tree",3);
        hm.put("four",4);
        // retrive map entries
        for(Map.Entry<String,Object> entry : hm.entrySet()) {
        	System.out.println(entry.getKey()+","+entry.getValue());
        }
	}

}

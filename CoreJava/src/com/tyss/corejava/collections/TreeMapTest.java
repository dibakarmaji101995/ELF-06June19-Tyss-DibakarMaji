package com.tyss.corejava.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String,Object> hm=null;
		//create hm object
        hm=new TreeMap<>();
        //add value to hm object
        hm.put("one",1);
        hm.put("two",2);
        hm.put("tree",3);
        hm.put("four",4);
        // retrive map entries
        for(Map.Entry<String,Object> entry : hm.entrySet()) {
        	System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Set<String> keys=hm.keySet();
        keys.forEach(key->{
        	System.out.println(key);
        });
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Collection<Object> values=hm.values();
        values.forEach(value->{
        	System.out.println(value);
        });
	}

}

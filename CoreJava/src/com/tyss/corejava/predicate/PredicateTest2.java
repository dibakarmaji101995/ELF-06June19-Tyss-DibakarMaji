package com.tyss.corejava.predicate;

import java.util.function.Predicate;

public class PredicateTest2 {
     
     public static void main(String[] args) {
    	 int[] b= {2,5,9,6,4,3};
         Predicate<Integer> p=a->{
        	  return a>4;
        	  };
         
		for(int i=0;i<b.length;++i) {
			if(p.test(b[i])) {
				System.out.println(b[i]);
			}
		}
	}
}

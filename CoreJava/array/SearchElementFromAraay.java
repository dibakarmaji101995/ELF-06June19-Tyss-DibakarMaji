package com.tyss.corejava.array;

import java.util.Arrays;
import java.util.Collections;

public class SearchElementFromAraay {
	public static void main(String[] args) {
		//create int array object
				Integer[] a= new Integer[] {5,2,1,4,3};
				int b=1;
				//searching logic
		/*
		 * for(int i=0;i<a.length;i++) { if(a[i]==b) {
		 * System.out.println("The index of search element is::"+i); } }
		 * 
		 */
				Arrays.sort(a);
				System.out.println(Arrays.toString(a));
				Integer index=Arrays.binarySearch(a,5 );
				System.out.println(index);
	}
}

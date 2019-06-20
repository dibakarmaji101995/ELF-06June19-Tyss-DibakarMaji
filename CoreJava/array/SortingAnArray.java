package com.tyss.corejava.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortingAnArray {

	public static void main(String[] args) {
		// create int array object
		Integer[] a = new Integer[] { 5, 2, 1, 4, 3 };
		int[] b = new int[a.length];
		int temp;
		// shorting logic
		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) {
		 * if (a[i] > a[j]) { temp = a[i]; a[i] = a[j]; a[j] = temp; } } }
		 */
     //   Arrays.sort(a);
		Arrays.sort(a,Collections.reverseOrder());
        Array.get(a,1);
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}

	}

}

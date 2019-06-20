package com.tyss.corejava.array;

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) {
		// create int array object
		int[] a = new int[] { 5, 2, 1, 4, 3 };
		int[] b = new int[a.length];
		// shorting logic
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				System.out.println("equal index " + i);
			}
		}
		 
	}
}

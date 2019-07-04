package com.tyss.corejava.array;

public class CopyOneArrayAndStoreIntoAnotherArray {

	public static void main(String[] args) {
		Integer[] a = new Integer[] { 5, 6, 2, 1, 4 };
		Integer[] b = new Integer[] { 30, 40, 50, 60, 70, 80 };
/*		Integer numElement = 3;
		Integer index = 2;
		for (int i = index, j = 0; i < b.length; ++i, ++j) {
			if (j < numElement) {
				b[i] = a[j];
			}
		}
		for (int i = 0; i < b.length; ++i) {
			System.out.print(b[i] + " ");
		}
       */
		System.arraycopy(a,0,b,2,3);
		for (int i = 0; i < b.length; ++i) {
			System.out.print(b[i] + " ");
		}
	}

}

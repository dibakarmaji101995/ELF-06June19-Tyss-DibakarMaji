package com.tyss.corejava.collections;

import java.util.Arrays;

public class CustomCollection {
	private static Integer currentIndex;
	private Object[] myArray;

	public CustomCollection() {
		this(10);
	}

	public CustomCollection(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be gater than zero");
		}
		myArray = new Object[size];
		currentIndex = 0;
	}

	public void add(Object obj) {
		if (currentIndex == myArray.length) {
			increseArraySize(myArray.length);
		}
		myArray[currentIndex] = obj;
		++currentIndex;
	}

	public Object get(int index) {
		return myArray[index];
	}

	public void remove(int index) {
		/*
		 * for (int i = 0; i < myArray.length; ++i) {
		 * 
		 * if (i >= index && i < myArray.length - 1) { myArray[i] = myArray[i + 1]; }
		 * 
		 * }
		 */
		if (index < myArray.length) {
			System.arraycopy(myArray, index + 1, myArray, index, myArray.length - index - 1);
		} else {
			throw new ArrayIndexOutOfBoundsException("Index must not gater than array length");
		}

	}

	@Override
	public String toString() {
		return "CustomCollection [myArray=" + Arrays.toString(myArray) + "]";
	}

	public void increseArraySize(int previousSize) {
		Object[] newArray = new Object[previousSize * 2];
		// copy previous arry to new array
		/*
		 * for(int i=0;i<previousSize;++i) { newArray[i]=myArray[i]; }
		 */
		System.arraycopy(myArray, 0, newArray, 0, previousSize);

 		myArray = new Object[previousSize * 2];
		/*
		 * for(int i=0;i<myArray.length;++i) { myArray[i]=newArray[i]; }
		 */
		System.arraycopy(newArray, 0, myArray, 0, myArray.length);

	}
	public int getSize() {
		return currentIndex-1;
	}
}

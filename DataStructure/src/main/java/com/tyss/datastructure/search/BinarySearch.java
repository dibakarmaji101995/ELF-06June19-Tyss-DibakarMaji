/*
 * 
 */
package com.tyss.datastructure.search;
/**
 * 
 * @author Administrator
 *
 */
public class BinarySearch {
	/**
	 * 
	 */
	private BinarySearch() {

	}
    /**
     * 
     * @param intArray
     * @param midIndex
     * @param lastIndex
     * @param searchElement
     * @return
     */
	public static Integer binarySearch(Integer[] intArray, Integer midIndex, Integer lastIndex, Integer searchElement) {
		if (intArray[midIndex].equals(searchElement)) {
			return midIndex;
		}
		if (searchElement > intArray[midIndex]) {
			for (Integer i = midIndex + 1; i < lastIndex; ++i) {
				if (intArray[i].equals(searchElement)) {
					return i;
				}
			}
		} else {
			for (Integer i = 0; i < midIndex; ++i) {
				if (intArray[i].equals(searchElement)) {
					return i;
				}
			}

		}
		return -1;
	}//binarySearch(-)
}//class

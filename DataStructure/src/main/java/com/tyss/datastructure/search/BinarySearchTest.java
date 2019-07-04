/*
 * 
 */
package com.tyss.datastructure.search;

import java.util.logging.Logger;

/**
 * 
 * @author Administrator
 *
 */
public class BinarySearchTest {
	/*   */
    private static final Logger logger=Logger.getLogger("MyLogger");
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		Integer[] intArray=null;
		Integer midIndex=null;
		Integer searchElementIndex=null;
		Integer searchElement=null;
		//create array object
        intArray= new Integer[] {1,2,3,4,5,6,7,8};
        //get middle element index
        midIndex=(intArray.length/2)+1;
        //enter searching element
        searchElement=43;
        //invoke binarySearch method to search an given element present or not
        searchElementIndex=BinarySearch.binarySearch(intArray, midIndex,intArray.length,searchElement);
        //display seach element index
        if(searchElementIndex.equals(-1)) {
        	logger.info("Searching Eelement "+searchElement+" is not found in the given array.");
        }else {
        	logger.info("Searching Eelement "+searchElement+" is found in the index "+searchElementIndex+" of given array.");
        }
	}//main(-)
}//class

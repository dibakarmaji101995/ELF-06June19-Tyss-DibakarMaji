package com.tyss.assessment.displayproduct;

public class Product {
     public static String getProduct(Integer option) {
    	 if(option.equals(1)) {
    		 return "KurKura";
    	 }else if(option.equals(2)){
    		 return "Lays";
    	 }else if(option.equals(3)) {
    		 return "Bingo";
    	 }else {
    		 return null;
    	 }
     }
}

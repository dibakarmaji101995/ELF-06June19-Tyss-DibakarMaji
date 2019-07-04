package com.tyss.corejava.enums;

public enum Loan {
    HOME(240),PERSONAL(245),CAR(100);
	 private Integer value;
	 
	 private Loan(Integer value) {
		 this.value=value;
	 }
	 
	 public Integer getValue() {
		 return value;
	 }
}

package com.tyss.corejava.enums;

import java.util.logging.Logger;

public class LoanTest {
    private static final Logger logger=Logger.getLogger("MyLogger");
	public static void main(String[] args) {
		Loan l=Loan.HOME;
		
		Integer constant=l.getValue();
		
		logger.info(constant.toString());
        
	}

}

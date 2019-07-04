package com.tyss.assessment.displaycollectionobject;

import java.util.logging.Logger;

public class CollectionsTest {
	public static final Logger logger = Logger.getLogger("MyLogger");

	public static void main(String[] args) {
		// get product
		logger.info(Collections.getProduct(1).toString());
		logger.info(Collections.getProduct(2).toString());

	}

}

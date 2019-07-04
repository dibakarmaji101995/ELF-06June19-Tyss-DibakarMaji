package com.tyss.assessment.displayproduct;

import java.util.logging.Logger;

public class ProductTest {
	 public static final Logger logger=Logger.getLogger("MyLogger");
	public static void main(String[] args) {
	    //get product
		 logger.info(Product.getProduct(1));
		 logger.info(Product.getProduct(2));

	}

}

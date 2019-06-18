package com.tyss.corejava.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Product {
	private static final Logger logger=Logger.getLogger("Product");
	public void buy() {
		logger.log(Level.FINE,"Fine log message");
		logger.log(Level.FINER,"Finer log message");
		logger.log(Level.FINEST,"Finest log message");
		logger.log(Level.CONFIG,"config log message");
		logger.log(Level.INFO,"Info log message");
		logger.log(Level.WARNING,"Warnng log message");
		logger.log(Level.SEVERE,"Severe log message");
	}
}

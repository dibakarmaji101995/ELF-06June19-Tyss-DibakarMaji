package com.tyss.corejava.logger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest1 {
    //create logger object
	private static final Logger logger=Logger.getLogger("Product");
	public static void main(String[] args) {
		FileHandler fh=null;
		try {
    	//reset logger level
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		//create COnsoleHandler object
		fh=new FileHandler("testLogMessage.log",true);
		fh.setFormatter(new SimpleFormatter());
		// set logger level
		fh.setLevel(Level.CONFIG);
		//add handler to logger
		logger.addHandler(fh);
		// create log message
		
		logger.log(Level.FINE,"Fine log message");
		logger.log(Level.FINER,"Finer log message");
		logger.log(Level.FINEST,"Finest log message");
		logger.log(Level.CONFIG,"config log message");
		logger.log(Level.INFO,"Info log message");
		logger.log(Level.WARNING,"Warnng log message");
		logger.log(Level.SEVERE,"Severe log message");
		
		//create product object
		Product product=new Product();
		product.buy();
		}catch (Exception e) {
			logger.log(Level.SEVERE,e.getMessage());
		}
		

	}

}

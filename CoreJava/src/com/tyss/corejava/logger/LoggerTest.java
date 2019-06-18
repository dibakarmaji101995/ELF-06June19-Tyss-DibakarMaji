package com.tyss.corejava.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerTest {
	//create logger object
    public static final Logger logger=Logger.getLogger("Java Logger Api");
    
    public static void main(String[] args) {
    	ConsoleHandler ch=null;
    	//reset logger level
		LogManager.getLogManager().reset();
//		logger.setLevel(Level.ALL);
		//create COnsoleHandler object
		ch=new ConsoleHandler();
		// set logger level
		ch.setLevel(Level.FINE);
		//add handler to logger
		logger.addHandler(ch);
		// create log message
		
		logger.log(Level.FINE,"Fine log message");
		logger.log(Level.FINER,"Finer log message");
		logger.log(Level.FINEST,"Finest log message");
		logger.log(Level.CONFIG,"config log message");
		logger.log(Level.INFO,"Info log message");
		logger.log(Level.WARNING,"Warnng log message");
		logger.log(Level.SEVERE,"Severe log message");
		
		
		
	}
}

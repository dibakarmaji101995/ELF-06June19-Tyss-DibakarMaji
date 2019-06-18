package com.tyss.corejava.logger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLogger {
   
	//create logger object
    public static final Logger logger=Logger.getLogger("amazon");
    static {
    	FileHandler fh=null;
		try {
    	//reset logger level
		LogManager.getLogManager().reset();
		logger.setLevel(Level. ALL);
		//create COnsoleHandler object
		fh=new FileHandler("amazonLogMessage.log",true);
		fh.setFormatter(new SimpleFormatter());
		// set logger level
		fh.setLevel(Level.CONFIG);
		//add handler to logger
		logger.addHandler(fh);
		}catch (Exception e) {
			e.printStackTrace();
		}
    } 
    
    private AmazonLogger() {
		
	}
   
}


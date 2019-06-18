package com.tyss.corejava.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
  //   public static final Logger logger=Logger.getLogger("amazon");
	private static final Logger logger=AmazonLogger.logger;
    public void login() {
    	logger.log(Level.INFO,"Login method");
    }
    
    
}

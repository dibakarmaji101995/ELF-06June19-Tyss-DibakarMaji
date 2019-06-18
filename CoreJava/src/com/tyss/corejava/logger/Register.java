package com.tyss.corejava.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	// private static final Logger logger=Logger.getLogger("amazon");
	private static final Logger logger=AmazonLogger.logger;
	 public void register() {
		 logger.log(Level.INFO,"Register Method ");
	 }
}

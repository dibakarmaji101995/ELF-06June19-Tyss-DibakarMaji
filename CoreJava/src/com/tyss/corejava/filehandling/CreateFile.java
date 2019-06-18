package com.tyss.corejava.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.tyss.corejava.logger.AmazonLogger;
/**
 * 
 * @author Administrator
 *
 */
public class CreateFile {
	private static final Logger logger=AmazonLogger.logger;
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		File file=null;
		//create file object
        file=new File("diba.txt");
        try {
			Boolean result=file.createNewFile();
			String res=result.toString();
			logger.log(Level.INFO,String.format("Result %s %s","is",res));
			logger.log(Level.INFO,"done");
		} catch (IOException e) {
			logger.log(Level.SEVERE,e.getMessage());
		}
	}

}

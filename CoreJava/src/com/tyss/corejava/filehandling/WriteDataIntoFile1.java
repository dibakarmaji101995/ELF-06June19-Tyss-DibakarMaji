package com.tyss.corejava.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 * @author Administrator
 *
 */
public class WriteDataIntoFile1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = null;
		char c[] = null;
		FileWriter fw = null;
		// create a string object
		msg = "welcome to java programming world";
		// convert string into char array object
		c = msg.toCharArray();
		// create FileOutputSteam object
		try {
			fw = new FileWriter(new File("password.txt"), true);
			fw.write(c);
			fw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

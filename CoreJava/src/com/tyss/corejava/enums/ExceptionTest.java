package com.tyss.corejava.enums;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class ExceptionTest {
	private static final Logger logger = Logger.getLogger("MyLogger");

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream(new File("diba.txt"))) {
			String s="bkjbvkvskjvbzsljv";
			byte[] b=s.getBytes();
			//create FileOutputStream object
			
			fos.write(b);
		} catch (ArithmeticException | NullPointerException | IOException e) {
			logger.info(e.getMessage());
		}

	}
}

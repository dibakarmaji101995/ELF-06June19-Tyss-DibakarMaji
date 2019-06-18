package com.tyss.corejava.filehandling;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class CreateFileByUsingApacheCommonsIO {

	public static void main(String[] args) {
		try {
			// create file
	    //    FileUtils.writeStringToFile(new File("apache.txt"),"This is apache commons io");
			FileUtils.writeStringToFile(new File("apache2.txt"),"This is apache commons io",Charset.defaultCharset());
	        System.out.println("create is done");
	        String fileData=FileUtils.readFileToString(new File("apache2.txt"),Charset.defaultCharset());
	        System.out.println("File Data::"+fileData);
	   
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package com.tyss.corejava.filehandling;

import java.io.File;
import java.io.IOException;


public class CreateFile1 {
	public static void main(String[] args) {
		File file=null;
		//create file object
        file=new File("movie/kannada/new");
        Boolean result=file.mkdirs();
        System.out.println("Result is::"+result);
        try {
        	file=new File("movie/kannada/new/program.txt");
			Boolean result1=file.createNewFile();
			 System.out.println("Result1 is::"+result1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
}

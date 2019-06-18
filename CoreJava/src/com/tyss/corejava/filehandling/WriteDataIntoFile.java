package com.tyss.corejava.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) {
		String msg=null;
		byte b[]=null;
		FileOutputStream fout=null;
		//create a string object
//		msg="welcome to java programming world";
		msg=". tanks";
		//convert string into byte object
		b=msg.getBytes();
		//create FileOutputSteam object
		try {
			fout=new FileOutputStream(new File("msg.txt"),true);
			fout.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

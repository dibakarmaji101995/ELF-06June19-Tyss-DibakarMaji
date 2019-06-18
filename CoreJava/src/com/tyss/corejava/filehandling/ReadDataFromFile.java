package com.tyss.corejava.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {
		FileInputStream fin = null;
		int i = 0;
		// create FileInputStream object
		try {
			fin = new FileInputStream(new File("diba.txt"));
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

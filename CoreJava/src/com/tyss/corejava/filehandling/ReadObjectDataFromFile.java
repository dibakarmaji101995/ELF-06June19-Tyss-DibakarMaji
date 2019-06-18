package com.tyss.corejava.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectDataFromFile {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Person p = null;
		try {
			// create FileInputStream object
			fis = new FileInputStream("person.txt");
			// create ObjectOutputStram object
			ois = new ObjectInputStream(fis);
			// read the file
			p = (Person) ois.readObject();
			// print person object
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

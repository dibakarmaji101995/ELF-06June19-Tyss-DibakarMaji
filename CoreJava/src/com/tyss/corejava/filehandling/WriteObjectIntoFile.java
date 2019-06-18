package com.tyss.corejava.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectIntoFile {

	public static void main(String[] args) {
		Person person = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		try {
			// create Person object
			person = new Person();
			// set value to person object fields
			person.setName("dibakar");
			person.setAge(22);
			person.setAddrs("hyd");
			person.setLandmark("ggg");
			// create FileOutputStream object
			fos = new FileOutputStream("person.txt");
			//create ObjectOutputStream object
			oos=new ObjectOutputStream(fos);
			oos.writeObject(person);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

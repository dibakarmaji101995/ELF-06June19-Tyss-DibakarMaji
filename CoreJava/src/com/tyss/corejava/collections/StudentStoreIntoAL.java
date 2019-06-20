package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStoreIntoAL {

	public static void main(String[] args) {
		List<Student> al = null;
		// create AL object
		al = new ArrayList<>();
		// add student objects to al
		al.add(new Student(2,"diba", 24, 75.0));
		al.add(new Student(3,"dipak", 24, 75.0));
		al.add(new Student(1,"dinesh", 24, 75.0));

		// retrieve student objects from al object
		al.forEach(stud -> {
			System.out.println(stud);
		});
		System.out.println("====================");
		// get Iterator object
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("+++++++++++++++++++++");
		for (Student stud : al) {
			System.out.println(stud);
		}

	}

}

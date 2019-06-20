package com.tyss.corejava.collections;

import java.util.Set;
import java.util.TreeSet;

public class StudentObjectsStoreIntoTreeSet {

	public static void main(String[] args) {
		Set<Student> ts=null;
		// create TreeSet Object
        ts=new TreeSet<>();
        //add ostudent objects to ts
        ts.add(new Student(2,"vikash", 24, 75.0));
        ts.add(new Student(1,"dipesh", 25, 78.0));
        ts.add(new Student(4,"sinu", 28, 73.0));

		// retrieve student objects from al object
        ts.forEach(stud -> {
			System.out.println(stud);
		});
	}

}

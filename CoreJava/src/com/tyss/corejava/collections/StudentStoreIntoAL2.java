package com.tyss.corejava.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentStoreIntoAL2 {

	public static void main(String[] args) {
		List<Student> al = null;
		// create AL object
		al = new ArrayList<>();
		// add student objects to al
		al.add(new Student(2,"diba", 24, 70.0));
		al.add(new Student(3,"dipak", 24, 75.0));
		al.add(new Student(1,"dinesh", 24, 71.0));

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
		System.out.println("++++++++++++++++");
		Student s=getTopper(al);
		System.out.println("The Topper is::"+s.getName()+" with percentage "+s.getPercentage());
		System.out.println("++++++++++++++++");
		System.out.println("++++++++++++++++");
		Student s1=getLower(al);
		System.out.println("The Lower is::"+s1.getName()+" with percentage "+s1.getPercentage());
		
		
		

		
	}
	public static Student getTopper(List<Student> list) {
		Comparator<Student> c=(stud1,stud2)->stud1.compareTo(stud2);
		Student s=list.stream().max(c).get();
		return s;
	}
	
	public static Student getLower(List<Student> list) {
		Comparator<Student> c=(stud1,stud2)->stud1.compareTo(stud2);
		Student s=list.stream().min(c).get();
		return s;
	}

}

package com.tyss.assessment.toppermalefemale;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class GetMaleAndFemaleTopper {
	public static final Logger logger = Logger.getLogger("MyLogger");
	public static void main(String[] args) {
		List<Student> arrayList = null;
		// create ArrayList object
		arrayList = new ArrayList<Student>();
		// add student object
		arrayList.add(new Student("raja", 78.0, "male"));
		arrayList.add(new Student("raja", 78.0, "female"));
		arrayList.add(new Student("raja", 80.0, "female"));
		arrayList.add(new Student("raja", 90.0, "male"));
		arrayList.add(new Student("raja", 95.0, "male"));
		arrayList.add(new Student("raja", 85.0, "female"));
		//display male topper
		System.out.println("Male Topper::"+arrayList.stream().filter(s->s.getGender().equals("male")).mapToDouble(s->s.getAvg()).max());
		System.out.println("Female Topper::"+arrayList.stream().filter(s->s.getGender().equals("female")).mapToDouble(s->s.getAvg()).max());
	}
}

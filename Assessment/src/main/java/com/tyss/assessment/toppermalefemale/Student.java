package com.tyss.assessment.toppermalefemale;

import javax.sql.DataSource;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {

	private String name;
	private Double avg;
	private String gender;

	public int compareTo(Student o) {
		return this.avg.compareTo(o.getAvg());
	}

	public Student(String name, Double avg, String gender) {
		super();
		this.name = name;
		this.avg = avg;
		this.gender = gender;
	}
     
}

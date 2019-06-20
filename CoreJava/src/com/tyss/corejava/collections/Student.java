package com.tyss.corejava.collections;

import lombok.Data;

@Data
public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	private Integer age;
	private Double percentage;

	
    /* Logic to sort student w.r.t percentage */
	/*
	 * @Override public int compareTo(Student o) { if(this.percentage< o.percentage)
	 * { return -1; }else if(this.percentage> o.percentage) { return 1; }else {
	 * return 0; }
	 * 
	 * }
	 */
	/* Logic to sort student w.r.t id */
	/*
	 * @Override public int compareTo(Student o) { if(this.id< o.id) { return -1;
	 * }else if(this.id> o.id) { return 1; }else { return 0; }
	 * 
	 * }
	 */
	
	/* Logic to sort student w.r.t name */
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
		
	}


	public Student(Integer id, String name, Integer age, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}

}

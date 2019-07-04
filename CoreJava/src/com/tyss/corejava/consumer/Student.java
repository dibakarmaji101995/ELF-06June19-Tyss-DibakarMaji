package com.tyss.corejava.consumer;

public class Student {
    private String name;
    private Integer m1;
    private Integer m2;
    private Integer m3;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getM1() {
		return m1;
	}
	public void setM1(Integer m1) {
		this.m1 = m1;
	}
	public Integer getM2() {
		return m2;
	}
	public void setM2(Integer m2) {
		this.m2 = m2;
	}
	public Integer getM3() {
		return m3;
	}
	public void setM3(Integer m3) {
		this.m3 = m3;
	}
	public Student(String name, Integer m1, Integer m2, Integer m3) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
    public void avg(Student stud) {
    	System.out.println("Avg::"+(stud.m1+stud.m2+stud.m3)/3);
    }
}

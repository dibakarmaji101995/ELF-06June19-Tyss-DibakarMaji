package com.tyss.corejava.filehandling;

import java.io.Serializable;

public class Person implements Serializable{
     private String name;
     private int age;
     private String addrs;
     private String landmark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addrs=" + addrs + ", landmark=" + landmark + "]";
	}
     
}

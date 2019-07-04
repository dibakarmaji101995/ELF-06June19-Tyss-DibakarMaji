package com.tyss.beans;

public class Customer {
    private String name;
    private Integer age;
    private String addrs;
    private Long phNo;
    
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", addrs=" + addrs + ", phNo=" + phNo + "]";
	}
    
	
    
}

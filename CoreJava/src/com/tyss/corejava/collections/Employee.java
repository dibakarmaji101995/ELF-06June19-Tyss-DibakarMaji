package com.tyss.corejava.collections;

import lombok.Data;

@Data
public class Employee {
	private Integer empId;
	private String empName;
	private String desg;
	private Double sal;

	public Employee(Integer empId, String empName, String desg, Double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desg = desg;
		this.sal = sal;
	}

	public Employee() {
		 
	}

}

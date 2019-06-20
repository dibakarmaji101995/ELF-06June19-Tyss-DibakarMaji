package com.tyss.corejava.collections;

import java.util.Comparator;

public class EmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
	    return e1.getEmpName().compareTo(e2.getEmpName());
	}

}

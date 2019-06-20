package com.tyss.corejava.array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Employee[] employees = null;
		// create employee array object
		employees = new Employee[] { new Employee("diba", 24, 5000.0),
				                     new Employee("ankita", 24, 4000.0),
				                     new Employee("dipak", 24, 54000.0) };
//		Arrays.sort(employees);

		for (Employee emp : employees) {
			System.out.println(emp);
		} 

	/*	System.out.println(Arrays.toString(employees));
		Arrays.fill(employees,1,2,new Employee("kabir",30,5600.0));
		System.out.println(Arrays.toString(employees));
		*/
	}

}

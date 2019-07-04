package com.tyss.corejava.lambdaexpression;

import java.util.Set;
import java.util.TreeSet;



public class EmployeeTest {
	public static void main(String[] args) {
			EmployeeById ebi=null;
		//	EmployeeBySal ebs=null;
		//	EmployeeByName ebn=null;
			Set<Employee> ts=null;
			//create EmployeeById class object
			ebi=new EmployeeById();
		//	ebs=new EmployeeBySal();
		//	ebn=new EmployeeByName();
			// create TreeSet Object
	        ts=new TreeSet<>(ebi);
		//	ts=new TreeSet<>(ebs);
		//	ts=new TreeSet<>(ebn);
	        //add ostudent objects to ts
	        ts.add(new Employee(100,"sarath","java developer",25800.0));
	        ts.add(new Employee(101,"dinesh","java developer",25700.0));
	        ts.add(new Employee(103,"kapil","java developer",25200.0));

			// retrieve student objects from al object
	        ts.forEach(prod -> {
				System.out.println(prod);
			});

		}
}

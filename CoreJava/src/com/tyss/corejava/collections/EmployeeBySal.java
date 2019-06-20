package com.tyss.corejava.collections;

import java.util.Comparator;

public class EmployeeBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if( e1.getSal() >e2.getSal()) {
			return 1;
		}else if(e1.getSal() < e2.getSal()) {
			return -1;
		}else {
			return 0;
		}
	}

}

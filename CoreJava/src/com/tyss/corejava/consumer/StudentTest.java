package com.tyss.corejava.consumer;

import java.util.function.Consumer;

public class StudentTest {
    public static void main(String[] args) {
		Student stud=new Student("diba",10,20,30);
//		stud.avg(stud);
		Consumer<Student> c=s->{
			System.out.println(s.getName()+" score is "+(s.getM1()+s.getM2()+s.getM3())/3);
		};
		c.accept(stud);
	}
}

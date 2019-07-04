package com.tyss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.beans.Car;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		// create IOC cntainer
		ctx = new ClassPathXmlApplicationContext("com/tyss/cfgs/applicationContext.xml");
		//get car object from IOC container
		Car car=ctx.getBean("car",Car.class);
		//invoke car class method
		System.out.println(car.getCarDetails());
		//close the IOC container
		((AbstractApplicationContext) ctx).close(); 
	}
}

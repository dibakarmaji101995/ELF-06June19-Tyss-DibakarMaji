package com.tyss.hbproj1.test;

import java.text.SimpleDateFormat;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hbproj1.entity.EmployeeInfoEntity;
import com.tyss.hbproject1.utility.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
		Session ses = null;
		Transaction tx = null;
		boolean flag = false;
		EmployeeInfoEntity emp = null;
		SimpleDateFormat sdf = null;
		// Get Session object
		ses = HibernateUtil.getSession();
		try {
			// create SimpleDateFormat object
			sdf = new SimpleDateFormat("yyyy-mm-dd");
			// create object for save/insert
			emp = new EmployeeInfoEntity();
			emp.setId(455);
			emp.setName("diba");
			emp.setAge(25);
			emp.setDob(sdf.parse("1995-09-10"));
			emp.setAccNumber(4455566L);
			emp.setDesg("java developer");
			emp.setDeptId(101);
			emp.setEmailId("diba@123");
			emp.setGender("M");
			emp.setJoiningDate(sdf.parse("2018-09-10"));
			emp.setMngrId(201);
			emp.setPhNo(123456L);
			emp.setSalary(2300.0);
			
			tx = ses.beginTransaction();
			// save object
			Integer id = (Integer) ses.save(emp);
			System.out.println("Generated id value::" + id);
			flag = true;
		} catch (HibernateException he) {
			flag = false;
			he.printStackTrace();
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			if (flag) {
				tx.commit();
				System.out.println("Object saved Succeded");
			} else {
		//		tx.rollback();
				System.out.println("Object not Sved");
			}
			// close objs
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		} // finally
	}// main
}// class

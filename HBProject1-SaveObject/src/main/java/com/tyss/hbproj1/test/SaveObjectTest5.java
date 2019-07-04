package com.tyss.hbproj1.test;

import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hbproj1.entity.EmployeeInfoEntity;
import com.tyss.hbproject1.utility.HibernateUtil;

public class SaveObjectTest5 {

	public static void main(String[] args) {
		Session ses = null;
		EmployeeInfoEntity emp = null;
		SimpleDateFormat sdf = null;
		// Get Session object
		ses = HibernateUtil.getSession();
		try {
			//get record from db
			emp=ses.get(EmployeeInfoEntity.class,455);
			System.out.println("Employee record whose id is 455::"+emp);
			
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			// close objs
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		} // finally
	}// main
}// class

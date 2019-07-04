package com.tyss.hbproj1.test;

import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hbproj1.entity.EmployeeInfoEntity;
import com.tyss.hbproject1.utility.HibernateUtil;

public class SaveObjectTest6 {

	public static void main(String[] args) {
		Session ses = null;
		Transaction tx=null;
		boolean flag=false;
		EmployeeInfoEntity emp = null;
		SimpleDateFormat sdf = null;
		// create SimpleDateFormat object
		sdf = new SimpleDateFormat("yyyy-mm-dd");
		// Get Session object
		ses = HibernateUtil.getSession();
		
		try {
			
			//begin transaction
			tx=ses.beginTransaction();
			//get record that we delete
		//	emp=ses.get(EmployeeInfoEntity.class,455);
			emp=new EmployeeInfoEntity();
			emp.setId(456);
			// get record from db
			ses.delete(emp);
			flag=true;

		} catch (HibernateException he) {
			flag=false;
			he.printStackTrace();
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		} finally {
			if(flag) {
				 tx.commit();
				 System.out.println("Object Deleted");
			}
			else {
				tx.rollback();
				 System.out.println("Object not found");
			}
			// close objs
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		} // finally
	}// main
}// class

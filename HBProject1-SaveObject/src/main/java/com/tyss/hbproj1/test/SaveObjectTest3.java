package com.tyss.hbproj1.test;

import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hbproj1.entity.DepartmentInfoEntity;
import com.tyss.hbproj1.entity.EmployeeOtherInfoEntity;
import com.tyss.hbproject1.utility.HibernateUtil;

public class SaveObjectTest3 {

	public static void main(String[] args) {
		Session ses = null;
		Transaction tx = null;
		boolean flag = false;
		DepartmentInfoEntity dept = null;
		SimpleDateFormat sdf = null;
		// Get Session object
		ses = HibernateUtil.getSession();
		try {
			// create SimpleDateFormat object
			sdf = new SimpleDateFormat("yyyy-mm-dd");
			// create object for save/insert
			dept = new DepartmentInfoEntity();
			dept.setDeptName("IT");
			//begin transaction
			tx = ses.beginTransaction();
			// save object
			Integer id = (Integer) ses.save(dept);
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

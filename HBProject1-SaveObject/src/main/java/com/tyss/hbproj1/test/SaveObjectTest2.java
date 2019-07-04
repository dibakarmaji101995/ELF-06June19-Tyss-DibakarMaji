package com.tyss.hbproj1.test;

import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hbproj1.entity.EmployeeOtherInfoEntity;
import com.tyss.hbproject1.utility.HibernateUtil;

public class SaveObjectTest2 {

	public static void main(String[] args) {
		Session ses = null;
		Transaction tx = null;
		boolean flag = false;
		EmployeeOtherInfoEntity emp = null;
		SimpleDateFormat sdf = null;
		// Get Session object
		ses = HibernateUtil.getSession();
		try {
			// create SimpleDateFormat object
			sdf = new SimpleDateFormat("yyyy-mm-dd");
			// create object for save/insert
			emp = new EmployeeOtherInfoEntity();
			emp.setAadharNumber(12345l);
			emp.setBloodGroup("B+");
			emp.setEmgContactName("dinesh");
			emp.setEmgContactNumber(456123L);
			emp.setFatherName("surath maji");
			emp.setIsMarried(0);
			emp.setIsSchallanged(1);
			emp.setMotherName("shasali maji");
			emp.setNationality("indian");
			emp.setPan("COLPM0174C");
			emp.setPassportNumber("R100000");
			emp.setReligion("Hindu");
			emp.setSpouseName("no");
			//begin transaction
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

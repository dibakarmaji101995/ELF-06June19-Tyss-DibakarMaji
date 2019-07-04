package com.tyss.hbproj1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_INFO")
public class EmployeeInfoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AGE")
	private Integer age;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "ACCOUNT_NUMBER")
	private Long accNumber;
	
	@Column(name = "DESIGNATION")
	private String desg;
	
	@Column(name = "PHONE")
	private Long phNo;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "SALARY")
	private Double salary;
	
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	
	@Column(name = "MNGR_ID")
	private Integer mngrId;
	
	@Column(name = "DEPT_ID")
	private Integer deptId;

	public EmployeeInfoEntity() {
		System.out.println("EmployeeInfoEntity::0-param constructor");
	}
	
	
}

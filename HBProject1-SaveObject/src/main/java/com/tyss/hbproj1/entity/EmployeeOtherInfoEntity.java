package com.tyss.hbproj1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_OTHERINFO")
public class EmployeeOtherInfoEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "PAN")
	private String pan;
	
	@Column(name = "AADHAR_NUMBER")
	private Long aadharNumber;
	
	@Column(name = "PASSPORT_NUMBER")
	private String passportNumber;
	
	@Column(name = "ISMARRIED")
	private Integer isMarried;
	
	@Column(name = "BLOOD_GRP")
	private String bloodGroup;
	
	@Column(name = "NATIONALITY")
	private String nationality;
	
	@Column(name = "EMERGENCY_CONTACT_NUMBER")
	private Long emgContactNumber;
	
	@Column(name = "EMERGENCY_CONTACT_NAME")
	private String emgContactName;
	
	@Column(name = "RELIGION")
	private String religion;
	
	@Column(name = "MOTHER_NM")
	private String motherName;
	
	@Column(name = "FATHER_NM")
	private String fatherName;
	
	@Column(name = "SPOUSE_NM")
	private String spouseName;
	
	@Column(name = "ISCHALLANGED")
	private Integer isSchallanged;
}

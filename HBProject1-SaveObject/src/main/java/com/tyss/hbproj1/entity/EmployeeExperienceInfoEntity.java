package com.tyss.hbproj1.entity;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeExperienceInfoEntity {
	private Integer id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;
}

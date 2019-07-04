package com.tyss.hbproj1.entity;

import lombok.Data;

@Data
public class EmployeeEducationInfoEntity {
	private Integer id;
	private String educationType;
	private Long collegeName;
	private String university;
	private String location;
	private String branch;
	private String degreeType;
	private Double percentage;
	private Integer yop;
}

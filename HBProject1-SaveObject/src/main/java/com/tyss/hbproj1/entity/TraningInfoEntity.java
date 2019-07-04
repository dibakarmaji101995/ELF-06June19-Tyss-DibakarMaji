package com.tyss.hbproj1.entity;

import lombok.Data;

@Data
public class TraningInfoEntity {
	private Integer id;
	private Integer courseId;
	private String courseName;
	private String duration;
	private String courseType;
}

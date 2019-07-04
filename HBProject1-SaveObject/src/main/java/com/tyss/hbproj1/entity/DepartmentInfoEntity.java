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
@Table(name="DEPARTMENT_INFO")
public class DepartmentInfoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="DEPT_ID")
    private Integer deptId;
	
	@Column(name="DEPT_NAME")
    private String deptName;
}

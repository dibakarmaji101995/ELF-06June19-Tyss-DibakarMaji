package com.tyss.createfileutils.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {
    private Integer id;
    private String name;
    private String email;
    private Long phNo;
    private Date joiningDate;
    private Double sal;
}

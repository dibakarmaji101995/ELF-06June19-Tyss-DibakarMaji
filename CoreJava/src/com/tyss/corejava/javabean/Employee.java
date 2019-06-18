package com.tyss.corejava.javabean;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {
   private Integer id;
   private String name;
   private String dept;
   private Double salary;
   private Integer age;
   private Date joiningDate;
   private String gender;
}

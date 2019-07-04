package com.tyss.hbproj1.entity;

import lombok.Data;

@Data
public class EmployeeAddressInfoEntity {
	private Integer id;
	private String addressType;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private String distict;
	private String state;
	private String country;
	private Integer pinCode;
}

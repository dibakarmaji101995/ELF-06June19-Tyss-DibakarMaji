package com.nt.jdbc;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import com.zaxxer.hikari.HikariDataSource;



public class CreateConnetionPoolByUsingHikariCP {
    public static void main(String[] args) {
		HikariDataSource ds=null;
		//create ds object
	//	ds=new BasicDataSource();
		ds=new HikariDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/tyss");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/tyss");
		ds.setUsername("root");
		ds.setPassword("root");
		//set initial size of a pool
//		ds.setInitialSize(10);    
		ds.setPoolName("MyPool");
		ds.setMaximumPoolSize(10);
		System.out.println(ds.getMaximumPoolSize());
		//set properties to ds 
		try {
			
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

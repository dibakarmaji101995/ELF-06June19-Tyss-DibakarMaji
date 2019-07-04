package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DBPropertiesUtil {
	private Properties props;
	
	public static DBPropertiesUtil getDBPropertiesUtil() throws FileNotFoundException, IOException {
		return new DBPropertiesUtil();
	}
	private DBPropertiesUtil() throws FileNotFoundException, IOException {
		props=new Properties();
		props.load(new FileInputStream("db.properties"));
	}
    public String getProperty(String key) {
    	return props.getProperty(key);
    }
}

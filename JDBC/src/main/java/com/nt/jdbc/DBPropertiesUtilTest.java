package com.nt.jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import static com.nt.jdbc.ConnectionPoolConstants.*;

public class DBPropertiesUtilTest {
	private static final Logger LOGGER = Logger.getLogger("MyLogger");
	private static DBPropertiesUtil dbpu;

	public DBPropertiesUtilTest() {
		try {
			dbpu = DBPropertiesUtil.getDBPropertiesUtil();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LOGGER.info(new DBPropertiesUtilTest().dbpu.getProperty(DB_ClASS_NAME));
		LOGGER.info(new DBPropertiesUtilTest().dbpu.getProperty(URL));
		LOGGER.info(new DBPropertiesUtilTest().dbpu.getProperty(USER_NAME));
		LOGGER.info(new DBPropertiesUtilTest().dbpu.getProperty(PASSWORD));
	}
}

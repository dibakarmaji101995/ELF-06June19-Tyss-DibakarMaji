package com.tyss.corejava.logger;

public class Test {
	 public static void main(String[] args) {
		   //initialize logger cfgs
		   try {
//			Class.forName("com.tyss.logger.AmazonLogger");
			Register reg = new Register();
			reg.register();
			Login login = new Login();
			login.login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
}

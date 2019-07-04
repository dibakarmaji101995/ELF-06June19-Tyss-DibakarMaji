package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		Scanner sc=null;
		String user=null,pass=null;
		Connection con=null;
		Statement st=null;
		String query=null;
		ResultSet rs=null;
		int count=0;
		
		try{
			//read inputs
			sc=new Scanner(System.in);
			if(sc!=null){
				System.out.println("Enter username::");
				user=sc.nextLine(); //gives raja
				System.out.println("Enter password::");
				pass=sc.nextLine(); //gives rani
			}
			//convert input values as required for the SQL Query
			user="'"+user+"'"; //gives 'raja'
			pass="'"+pass+"'"; //gives 'rani'
			
			//register jdbc driver s/w
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:oci8:@xe", "system","manager");
			//create Statement obj
			if(con!=null)
				st=con.createStatement();
			//send and execute SQL Query in DB s/w
			     //select count(*) from userlist where uname='raja' and pwd='rani'
			  query="select count(*) from userlist where uname="+user+" and pwd="+pass;
			 System.out.println(query);
			 //send and execute SQL query
			 if(st!=null)
				 rs=st.executeQuery(query);
			 //process the ResultSet
			 if(rs!=null){
				 rs.next();
				 count=rs.getInt(1);
			 }
			  if(count==0)
				  System.out.println("InValid Credentials");
			  else
				  System.out.println("Valid Credentials");
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
		  cnf.printStackTrace();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//close jdbc objs
			try{
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			
			try{
				if(st!=null)
					st.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(sc!=null)
					sc.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}//finally

	}//main
}//class

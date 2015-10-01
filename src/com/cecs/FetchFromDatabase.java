package com.cecs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchFromDatabase {

	Jdbc_conn conn= new Jdbc_conn();
	public ResultSet getUserAndPassword() throws ClassNotFoundException, SQLException{
		String username="";
		String password="";
		String user="Select * from user where username="+username+", password="+password;
		
		ResultSet rs= conn.connection(user);
		return rs;
	}
	
}

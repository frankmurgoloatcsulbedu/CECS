package com.cecs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

	FetchFromDatabase fd = new FetchFromDatabase();
	public boolean validateLogin(String username, String password) throws ClassNotFoundException, SQLException{

		ResultSet rs1= fd.getUserAndPassword();
		while(rs1.next()){
			
			if(username.equalsIgnoreCase(rs1.getString(username)) && password.equalsIgnoreCase(rs1.getString(password)));
			{
				return true;
			}//if ends here
			
		}//while ends here
		return false;
	}
}

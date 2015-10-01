package com.cecs;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {
FetchFromDatabase fd= new FetchFromDatabase();
Jdbc_conn conn= new Jdbc_conn();
LoginService ls= new LoginService();
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			 Model model,HttpServletRequest request) throws ClassNotFoundException, SQLException{
		
		String message="";
		
		Boolean isValidLogin= ls.validateLogin(username,password);
		if(isValidLogin){
			model.addAttribute(message, "Login Successfully");
			return("home");
		}// if ends here
			else{
			model.addAttribute(message, "Invalid Username or password");
			return("login");
				
			}//else code ends here
			
		}//method login ends here
		
	}// class code ends here



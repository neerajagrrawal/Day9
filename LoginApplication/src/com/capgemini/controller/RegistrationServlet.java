package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private HashMap<String,String> users=new HashMap<>() ;
	private ServletContext context ;
    public RegistrationServlet() {
        super();
        }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	context=config.getServletContext() ;
    }

    
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter() ;
		String uname=request.getParameter("username") ;
		String pass=request.getParameter("pass") ;
		
		if(users.containsKey(uname)) {
			out.println("<h3>User already exists.Please enter another username</h3>");
			out.println("<br><br><a href='registration.html'>Try Again</a>");
			}
		else {
			users.put(uname, pass) ;
			out.println("<h3>Registration Successsful!!</h3>");
			out.println("<br><br><a href='login.html'>Login Here</a>");
		}
		context.setAttribute("UserData", users);
		out.close();
		out.println("<h3>User already exists. Please enter another username</h3>") ;
		
		
	}

}

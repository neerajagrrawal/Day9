package com.capgemnini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorldServlet() {
        super();
        System.out.println("Inside Constructor"); 
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("Inside init");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() method is called");
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter() ;
		out.println("<h1>Hello World</h1>");
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy");
	}

}

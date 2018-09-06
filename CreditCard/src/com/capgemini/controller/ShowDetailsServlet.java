package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showdetails")
public class ShowDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ShowDetailsServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter() ;
		String name = request.getParameter("name");
		long creditNumber = Long.parseLong(request.getParameter("credit_card_number"));
		int cvv = Integer.parseInt(request.getParameter("cvv")) ;
		int month = Integer.parseInt(request.getParameter("exp_date_month")) ;
		int year = Integer.parseInt(request.getParameter("exp_date_year")) ;
		
		out.println("<body><table border=2><tr><th bgcolor=red>Name</th>");
		
		out.println("<th bgcolor=red>Credit card number</th>");
		out.println("<th bgcolor=red>Expiry date</th>");
		out.println("<th bgcolor=red>cvv</th></tr>");
		
		out.println("<tr><td bgcolor=yellow>"+name+"</td>");
		out.println("<td bgcolor=yellow>"+creditNumber+"</td>");
		out.println("<td bgcolor=yellow>"+month+"/"+year+"</td>");
		out.println("<td bgcolor=yellow>"+cvv+"</td></tr>");

	}

}

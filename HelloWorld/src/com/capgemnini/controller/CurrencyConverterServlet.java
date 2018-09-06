package com.capgemnini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/curencyConverter")
public class CurrencyConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CurrencyConverterServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter() ;
		out.println("<body><table border=2><tr><th bgcolor=red>Rupee Value</th>");
		out.println("<th bgcolor=red>Dollar Value</th></tr>");
		for(int i=1;i<=50;i++)
		{
			out.println("<tr><td bgcolor=yellow>"+i*45+"</td>");
			out.println("<td bgcolor=yellow>"+i+"</td></tr>") ;
		}
		out.println("</table>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

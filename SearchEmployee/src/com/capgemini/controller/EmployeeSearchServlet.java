package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employeeSearch")
public class EmployeeSearchServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ArrayList<Employee> employees=new ArrayList<>() ;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		Employee e1=new Employee("neeraj", "ML", 1007, 90000) ;
		Employee e2=new Employee("spandhana", "CS", 1008, 80000) ;
		Employee e3=new Employee("tejasri", "EC", 1009, 70000) ;
		Employee e4=new Employee("aman", "AR", 1010, 6000) ;
		employees.add(e1) ;
		employees.add(e2) ;
		employees.add(e3) ;
		employees.add(e4) ;
		}
	
  
    public EmployeeSearchServlet() {
        super();
        
      }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter() ;
		String empNumber=request.getParameter("employee_number") ;
		int status=1 ;
		for(Employee temp : employees){
	        if(temp.getEmpId()==Long.parseLong(empNumber))
	        {
	        	out.println("<body><table border=2><tr><th bgcolor=red>Employee Id</th>");
	    		out.println("<th bgcolor=red>Employee Name</th>");
	    		out.println("<th bgcolor=red>Employee Department</th>");
	    		out.println("<th bgcolor=red>Employee Salary</th></tr>");
	    		
	    		out.println("<tr><td bgcolor=yellow>"+temp.getEmpId()+"</td>");
	    		out.println("<td bgcolor=yellow>"+temp.getName()+"</td>");
	    		out.println("<td bgcolor=yellow>"+temp.getDepartmentName()+"</td>");
	    		out.println("<td bgcolor=yellow>"+temp.getSalary()+"</td></tr>");
	    		status=2 ;
	    		break ;
			}
	      }
		if(status!=2)
        {
        	out.println("Employee does not exists. Please <a href='employee.html'>Try Again!!</a>");
        }
		
		
	}

	

}

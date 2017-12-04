package com.cheer.servlet.web.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cheer.servlet.domain.Emp;
import com.cheer.servlet.service.EmpService;

/**
 * Servlet implementation class addEmp
 */

public class addEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public addEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		//String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		
		
		EmpService empService = (EmpService)this.getServletContext().getAttribute("empService");
		
		
		Emp emp = new Emp();
		emp.setEmpno(Integer.valueOf(empno));
		emp.setEname(ename);
		emp.setJob(job);
		
		emp.setHiredate(new Date(1));
		
		emp.setSal(Double.valueOf(sal));
		System.out.println(empno);
		empService.save(emp);
		
		response.sendRedirect("../index.jsp");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

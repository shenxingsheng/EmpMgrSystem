package com.cheer.servlet.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cheer.servlet.domain.Emp;
import com.cheer.servlet.service.EmpService;

/**
 * Servlet implementation class updateEmp
 */
public class updateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public updateEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String job = request.getParameter("job");
		String empno = request.getParameter("empno");
		
		EmpService empService = (EmpService)this.getServletContext().getAttribute("empService");
		
		Emp emp = new Emp();
		
		emp.setJob(job);
		emp.setEmpno(Integer.valueOf(empno));
		
		empService.update(emp);
		response.sendRedirect("../index.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

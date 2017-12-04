package com.cheer.servlet.web.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cheer.servlet.domain.User;
import com.cheer.servlet.service.UserService;


@WebServlet(name = "login", urlPatterns = {"/servlet/login"})
public class LoginServlet extends HttpServlet
{
    private static final Logger LOGGER = LogManager.getLogger(LoginServlet.class);

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,
        IOException
    {
    	String userName = request.getParameter("username");
    	String passWord = request.getParameter("password");
    	
    	LOGGER.info(userName);
    	LOGGER.info(passWord);
    	UserService userService = (UserService)this.getServletContext().getAttribute("userService");
    	
    	List<User> userList = userService.getAll();
    	
    	for(User user:userList)
    	{
    		if(user.getUserName().equals(userName) && user.getPassWord().equals(passWord))
    		{
    			response.sendRedirect("../index.jsp");
    		}
    	}
    	response.sendRedirect("../userLogin.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,
        IOException
    {

        this.doGet(request, response);
    }

}

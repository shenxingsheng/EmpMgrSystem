/*
 * 文件名：DiListener.java 版权：Copyright by www.cheer.com 描述： 修改人：Cheer 修改时间：2017年11月28日
 */

package com.cheer.servlet.web.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cheer.servlet.dao.DeptDao;
import com.cheer.servlet.dao.EmpDao;
import com.cheer.servlet.dao.UserDao;
import com.cheer.servlet.dao.impl.DeptDaoImpl;
import com.cheer.servlet.dao.impl.EmpDaoImpl;
import com.cheer.servlet.dao.impl.UserDaoImpl;
import com.cheer.servlet.service.EmpService;
import com.cheer.servlet.service.UserService;
import com.cheer.servlet.service.impl.EmpServiceImpl;
import com.cheer.servlet.service.impl.UserServiceImpl;


@WebListener
public class BeanRegistListener implements ServletContextListener
{

    private static final Logger LOGGER = LogManager.getLogger(BeanRegistListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        LOGGER.info("ServletContext Listener......");
        ServletContext application = sce.getServletContext();

        DeptDao deptDao = new DeptDaoImpl();
        EmpDao empDao = new EmpDaoImpl(deptDao);
        
        UserDao userDao =new UserDaoImpl();
        UserService userService = new UserServiceImpl(userDao);

        EmpService empService = new EmpServiceImpl(empDao);

        application.setAttribute("empService", empService);
        application.setAttribute("userService", userService);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {

    }

}

/*
 * 文件名：UserDaoimpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：ThinkPad
 * 修改时间：2017年12月4日
 */

package com.cheer.servlet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cheer.servlet.dao.UserDao;
import com.cheer.servlet.domain.Dept;
import com.cheer.servlet.domain.Emp;
import com.cheer.servlet.domain.User;
import com.cheer.servlet.util.DBHelper;

public class UserDaoImpl implements UserDao
{
	 private static final Logger LOGGER = LogManager.getLogger(UserDaoImpl.class);
	public List<User> getAll()
	{
		List<User> userList = new ArrayList<>();
        Connection conn = DBHelper.getInstance().getConnection();

        // String sql = "SELECT * FROM tbl_emp e LEFT OUT JOIN tbl_dept d ON(e.deptno = d.deptno)
        // ORDER BY empno";

        String sql = "SELECT * FROM tbl_user ORDER BY userid";

        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            User user = null;
            while (rs.next())
            {
                user = new User();

                user.setUserId(rs.getInt("userid"));
                user.setUserName(rs.getString("username"));
                user.setPassWord(rs.getString("password1"));

                userList.add(user);
            }
        }
        catch (SQLException e)
        {
            LOGGER.catching(e);
        }
        finally
        {
            DBHelper.closeResultSet(rs);
            DBHelper.closeStatement(ps);
        }

        return userList;
	}
}

/*
 * 文件名：UserDaoServiceImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：ThinkPad
 * 修改时间：2017年12月4日
 */

package com.cheer.servlet.service.impl;

import java.util.List;

import com.cheer.servlet.dao.UserDao;
import com.cheer.servlet.domain.User;
import com.cheer.servlet.service.UserService;

public class UserServiceImpl implements UserService
{
	private UserDao  userDao;
	
	public UserServiceImpl(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	
	public List<User> getAll()
	{
		return userDao.getAll();
	}
	
}

/*
 * 文件名：UserDao.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：ThinkPad
 * 修改时间：2017年12月4日
 */

package com.cheer.servlet.dao;

import java.util.List;

import com.cheer.servlet.domain.User;

public interface UserDao
{
	List<User> getAll();
}

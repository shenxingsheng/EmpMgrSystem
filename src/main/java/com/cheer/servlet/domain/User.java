/*
 * 文件名：User.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：ThinkPad
 * 修改时间：2017年12月4日
 */

package com.cheer.servlet.domain;

public class User
{
	int userId;
	
	String userName;
	
	String passWord;
	
	public User()
	{
		
	}
	
	public User(int userId, String userName, String passWord)
	{
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassWord()
	{
		return passWord;
	}

	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}

	
}

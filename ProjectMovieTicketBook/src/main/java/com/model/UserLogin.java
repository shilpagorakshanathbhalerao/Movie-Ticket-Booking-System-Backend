package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLogin 
{
	@Id
	private int userLoginId;
	private String userLoginMail;
	private String userLoginPass;
	public UserLogin() {
		super();
	}
	public UserLogin(int userLoginId, String userLoginMail, String userLoginPass) {
		super();
		this.userLoginId = userLoginId;
		this.userLoginMail = userLoginMail;
		this.userLoginPass = userLoginPass;
	}
	public int getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(int userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserLoginMail() {
		return userLoginMail;
	}
	public void setUserLoginMail(String userLoginMail) {
		this.userLoginMail = userLoginMail;
	}
	public String getUserLoginPass() {
		return userLoginPass;
	}
	public void setUserLoginPass(String userLoginPass) {
		this.userLoginPass = userLoginPass;
	}
	
	

}

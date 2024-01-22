package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User 
{
	@Id
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private Long userMobNo;
	private String userLastName;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Role> roles;

	@OneToMany(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval = true)
	private List<Movie> movie;

	public User() {
		super();
	}

	public User(int userId, String userName, String userEmail, String userPassword, Long userMobNo, String userLastName,
			List<Role> roles, List<Movie> movie) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userMobNo = userMobNo;
		this.userLastName = userLastName;
		this.roles = roles;
		this.movie = movie;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Long getUserMobNo() {
		return userMobNo;
	}

	public void setUserMobNo(Long userMobNo) {
		this.userMobNo = userMobNo;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userMobNo=" + userMobNo + ", userLastName=" + userLastName + ", roles=" + roles
				+ ", movie=" + movie + "]";
	}

	
	
}

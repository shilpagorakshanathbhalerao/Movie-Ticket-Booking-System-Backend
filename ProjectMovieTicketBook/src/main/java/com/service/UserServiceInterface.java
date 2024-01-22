package com.service;

import java.util.List;

import com.model.User;

public interface UserServiceInterface 
{
	
	public User saveUser(User u);
	public List<User> saveAllUser(List<User> list);
	public User getOneUser(int userId);
	public List<User> getAllUser();
	public void deleteOneUser(int userId);	
	public User updateUser(User u);

	public User getUserByEmail(String tempEmail);

	public User findByEmailIdAndPassword(String tempEmail, String tempPass);

}

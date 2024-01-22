package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInterface 
{
	@Autowired
	UserRepository userRepo; 
	
	@Override
	public User saveUser(User u) 
	{
		userRepo.save(u);
		return u;
		
	}

	@Override
	public List<User> saveAllUser(List<User> list) 
	{
		userRepo.saveAll(list);
		return list;
		
	}

	@Override
	public User getOneUser(int userId)
	{
		return userRepo.findById(userId).orElse(null);
		
	}

	@Override
	public List<User> getAllUser() 
	{
		return userRepo.findAll();
	}

	@Override
	public void deleteOneUser(int userId) 
	{
		userRepo.deleteById(userId);
		
	}
	
	public User updateUser(User u) 
	{
		User existUser=userRepo.findById(u.getUserId()).orElse(null);
		existUser.setUserName(u.getUserName());;
		return userRepo.save(existUser);
	}
	
	public User getUserByEmail(String userEmail) {

		return userRepo.findUserByEmail(userEmail);
	}
	
	public User findByEmailIdAndPassword(String userEmail, String userPassword) {

		return userRepo.findByEmailIdAndPassword(userEmail, userPassword);
	}
	
}


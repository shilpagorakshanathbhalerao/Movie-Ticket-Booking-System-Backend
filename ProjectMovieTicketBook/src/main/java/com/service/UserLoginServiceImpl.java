package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.UserLogin;
import com.repository.UserLoginRepository;

@Service
public class UserLoginServiceImpl implements UserLoginServiceInterface
{
	@Autowired
	UserLoginRepository userLoginRepo;
	
	@Override
	public UserLogin saveUserLogin(UserLogin l) 
	{
		userLoginRepo.save(l);
		return l;
		
	}

}


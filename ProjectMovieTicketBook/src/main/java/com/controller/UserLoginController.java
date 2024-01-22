package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserLogin;
import com.service.UserLoginServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserLoginController 
{
	@Autowired
	UserLoginServiceInterface userLoginService;
	
	@PostMapping("/addUserLogin")
	public UserLogin addUserLogin(@RequestBody UserLogin l)
	{
		userLoginService.saveUserLogin(l);
		return l;
	}
}


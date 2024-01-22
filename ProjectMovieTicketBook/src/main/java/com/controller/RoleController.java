package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Role;
import com.service.RoleServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RoleController 
{
	@Autowired
	RoleServiceInterface roleService; 
	
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role r)
	{
		roleService.saveRole(r);
		return r;
	}
	@GetMapping("/getOneRole/{id}")
	public Role getOneRole(@PathVariable int roleId) 
	{
		return roleService.getOneRole(roleId);
		
	}
	@GetMapping("/deleteRoleMapping/{id}")
	public void deleteOneRole(@PathVariable int roleId) 
	{
		roleService.deleteOneRole(roleId);
		
	}

}

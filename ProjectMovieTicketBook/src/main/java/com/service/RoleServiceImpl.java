package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Role;
import com.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleServiceInterface
{
	@Autowired
	RoleRepository roleRepo;

	@Override
	public Role saveRole(Role r) 
	{
		roleRepo.save(r);
		return r;
		
	}

	@Override
	public Role getOneRole(int roleId)
	{
		return roleRepo.findById(roleId).orElse(null);
		
	}


	@Override
	public void deleteOneRole(int roleId) 
	{
		roleRepo.deleteById(roleId);
		
	}


}


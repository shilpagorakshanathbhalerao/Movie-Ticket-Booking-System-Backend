package com.service;

import com.model.Role;

public interface RoleServiceInterface 
{
	public Role saveRole(Role r);
	public Role getOneRole(int roleId);
	public void deleteOneRole(int roleId);
}
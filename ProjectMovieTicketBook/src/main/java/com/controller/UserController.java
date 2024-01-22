package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController 
{
	@Autowired
	UserServiceInterface userService; 
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) throws Exception
	{
	
		String tempEmail =user.getUserEmail();
		if(tempEmail !=null && !"".equals(tempEmail)) {
			User userObj=userService.getUserByEmail(tempEmail);
			if(userObj!=null) {
				throw new Exception("User with "+tempEmail+" is already exit");
			}
		}
		User userObj1=null;
		userObj1=userService.saveUser(user);
		return userObj1;
	}
	
	@PostMapping("/loginUser")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmail=user.getUserEmail();
		String tempPass=user.getUserPassword();
		User userObj=null;
		if(tempEmail !=null && tempPass!=null) {
			userObj=userService.findByEmailIdAndPassword(tempEmail, tempPass);
		}
		if(userObj==null) {
			throw new Exception("Bad Creadentials");
		}
		return userObj;
		
	}
	@PostMapping("/addAllUser")
	public List<User> addAllUser(@RequestBody List<User> list) 
	{
		return userService.saveAllUser(list);
	}
	@GetMapping("/getOneUser/{userId}")
	public User getOneUser(@PathVariable int userId) 
	{
		return userService.getOneUser(userId);
		
	}
	@GetMapping("/getAllUser")	
public List<User> getAllUser() {
		
		return userService.getAllUser();
	}
	@DeleteMapping("/deleteUser/{userId}")
	public void deleteOneUser(@PathVariable int userId) {
		userService.deleteOneUser(userId);
		
	}
	
	@PutMapping("/updateUser")
	public User updateuser(@RequestBody User user) {
        return userService.updateUser(user);
    }
	

}

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

import com.model.Show;
import com.service.ShowServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ShowController
{
	@Autowired
	ShowServiceInterface show1Service; 
	
	@PostMapping("/addShow")
	public Show addShow(@RequestBody Show s)
	{
		show1Service.saveShow(s);
		return s;
	}
	@PostMapping("/addAllShow")
	public List<Show> addAllShow(@RequestBody List<Show> list) 
	{
		return show1Service.saveAllShow(list);
	}
	@GetMapping("/getOneShow/{showId}")
	public Show getOneShow(@PathVariable int showId) 
	{
		return show1Service.getOneShow(showId);
		
	}
	@GetMapping("/getAllShow")	
    public List<Show> getAllShow() 
	{
		
		return show1Service.getAllShow();
	}
	@DeleteMapping("/deleteShowMapping/{showId}")
	public void deleteOneShow(@PathVariable int showId) 
	{
		show1Service.deleteOneShow(showId);
		
	}

	@PutMapping("updateShow")
	public Show updateShow(@RequestBody Show s) 
	{
		return show1Service.updateShow(s);
	}
}

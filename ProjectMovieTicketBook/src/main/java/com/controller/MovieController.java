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

import com.model.Movie;
import com.service.MovieServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController
{
	@Autowired
	MovieServiceInterface movieService; 
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie m)
	{
		movieService.saveMovie(m);
		return m;
	}
	@PostMapping("/addAllMovie")
	public List<Movie> addAllMovie(@RequestBody List<Movie> list) 
	{
		return movieService.saveAllMovie(list);
	}
	@GetMapping("/getOneMovie/{movieId}")
	public Movie getOneMovie(@PathVariable int movieId) 
	{
		return movieService.getOneMovie(movieId);
		
	}
	@GetMapping("/getAllMovie")	
public List<Movie> getAllMovie() {
		
		return movieService.getAllMovie();
	}
	@DeleteMapping("/deleteMovieMapping/{movieId}")
	public void deleteOneMovie(@PathVariable int movieId) 
	{
		movieService.deleteOneMovie(movieId);
		
	}
	
	@PutMapping("updateMovie")
	public Movie updateMovie(@RequestBody Movie m) 
	{
		return movieService.updateMovie(m);
	}

}


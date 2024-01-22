package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Movie;
import com.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieServiceInterface 
{
	@Autowired
	MovieRepository movieRepo;

	@Override
	public Movie saveMovie(Movie m) 
	{
		movieRepo.save(m);
		return m;
		
	}

	@Override
	public List<Movie> saveAllMovie(List<Movie> list) 
	{
		movieRepo.saveAll(list);
		return list;
		
	}

	@Override
	public Movie getOneMovie(int movieId)
	{
		return movieRepo.findById(movieId).orElse(null);
		
	}

	@Override
	public List<Movie> getAllMovie() 
	{
		return movieRepo.findAll();
	}

	@Override
	public void deleteOneMovie(int movieId) 
	{
		movieRepo.deleteById(movieId);
		
	}
	
	public Movie updateMovie(Movie m) 
	{
		Movie existMovie=movieRepo.findById(m.getMovieId()).orElse(null);
		existMovie.setMovieName(m.getMovieName());;
		return movieRepo.save(existMovie);
	}
}

package com.service;

import java.util.List;

import com.model.Movie;

public interface MovieServiceInterface
{
	public Movie saveMovie(Movie m);
	public List<Movie> saveAllMovie(List<Movie> list);
	public Movie getOneMovie(int movieId);
	public List<Movie> getAllMovie();
	public void deleteOneMovie(int movieId);
	public Movie updateMovie(Movie m);
}

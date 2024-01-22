package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie 
{
	@Id
	private int movieId;
	private String movieName;
	private String durationTime;
	private int movieRate;
	private String movieCast;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Show> show;

	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getDurationTime() {
		return durationTime;
	}


	public void setDurationTime(String durationTime) {
		this.durationTime = durationTime;
	}


	public int getMovieRate() {
		return movieRate;
	}


	public void setMovieRate(int movieRate) {
		this.movieRate = movieRate;
	}


	public String getMovieCast() {
		return movieCast;
	}


	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}


	public List<Show> getShow() {
		return show;
	}


	public void setShow(List<Show> show) {
		this.show = show;
	}


	public Movie(int movieId, String movieName, String durationTime, int movieRate, String movieCast,
			List<Show> show) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.durationTime = durationTime;
		this.movieRate = movieRate;
		this.movieCast = movieCast;
		this.show = show;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", durationTime=" + durationTime
				+ ", movieRate=" + movieRate + ", movieCast=" + movieCast + ", show=" + show + "]";
	}


	public Movie() {
		super();
	}

	
}
package com.service;

import java.util.List;

import com.model.Show;

public interface ShowServiceInterface 
{
	public Show saveShow(Show s);
	public List<Show> saveAllShow(List<Show> list);
	public Show getOneShow(int showId);
	public List<Show> getAllShow();
	public void deleteOneShow(int showId);
	public Show updateShow(Show s);
}
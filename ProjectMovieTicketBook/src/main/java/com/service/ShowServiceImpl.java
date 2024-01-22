package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Show;
import com.repository.ShowRepository;

@Service
public class ShowServiceImpl implements ShowServiceInterface
{
	@Autowired
	ShowRepository showRepo;

	@Override
	public Show saveShow(Show s) 
	{
		showRepo.save(s);
		return s;
		
	}

	@Override
	public List<Show> saveAllShow(List<Show> list) 
	{
		showRepo.saveAll(list);
		return list;
		
	}

	@Override
	public Show getOneShow(int showId)
	{
		return showRepo.findById(showId).orElse(null);
		
	}

	@Override
	public List<Show> getAllShow() 
	{
		return showRepo.findAll();
	}

	@Override
	public void deleteOneShow(int showId) 
	{
		showRepo.deleteById(showId);
		
	}

	public Show updateShow(Show s) 
	{
		Show existShow=showRepo.findById(s.getShowId()).orElse(null);
		existShow.setShowName(s.getShowName());;
		return showRepo.save(existShow);
	}

}

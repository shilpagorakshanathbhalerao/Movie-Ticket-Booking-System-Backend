package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> 
{

}

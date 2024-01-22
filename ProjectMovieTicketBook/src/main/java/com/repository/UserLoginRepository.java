package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Integer> {

}


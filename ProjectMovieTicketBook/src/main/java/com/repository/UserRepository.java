package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("Select u from User u where u.userEmail=:userEmail")
	User findUserByEmail(@Param("userEmail") String email);

	@Query("Select u from User u where u.userEmail=:userEmail And u.userPassword=:userPassword")
	User findByEmailIdAndPassword(@Param("userEmail")String email ,@Param("userPassword")String password);

}

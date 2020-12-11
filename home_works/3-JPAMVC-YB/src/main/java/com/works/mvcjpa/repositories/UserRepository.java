package com.works.mvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.works.mvcjpa.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(" select u from User u where mail= ?1 and pass = ?2 ")
	User userLogin(String mail, String pass);

}

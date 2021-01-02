package com.works.againproj.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.againproj.models.User;


public interface UserJpaRespository extends JpaRepository<User, Integer> {
	
	Optional<User> findByMailAndPass( String mail, String pass );

}

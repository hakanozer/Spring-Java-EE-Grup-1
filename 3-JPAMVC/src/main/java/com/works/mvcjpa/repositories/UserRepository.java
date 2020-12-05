package com.works.mvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.mvcjpa.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

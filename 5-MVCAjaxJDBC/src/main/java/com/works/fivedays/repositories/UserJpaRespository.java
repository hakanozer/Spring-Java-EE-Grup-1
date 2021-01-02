package com.works.fivedays.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.fivedays.models.User;

public interface UserJpaRespository extends JpaRepository<User, Integer> {

}

package com.works.sevendays.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.works.sevendays.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
		
	//@Query("select COUNT(u.name) from UserInfo u where u.name = ?1")
	//long serviceUseUserCount( String name );
	 long countByName(String name);
	
}

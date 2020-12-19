package com.works.fourdays.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.works.fourdays.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	Admin findByMailAndPass(String mail, String pass);

}

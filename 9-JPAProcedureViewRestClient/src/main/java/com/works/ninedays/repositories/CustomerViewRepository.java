package com.works.ninedays.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.ninedays.entities.CustomerView;

public interface CustomerViewRepository extends JpaRepository<CustomerView, Integer> {

}

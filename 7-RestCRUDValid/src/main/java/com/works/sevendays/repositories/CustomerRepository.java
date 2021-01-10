package com.works.sevendays.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.sevendays.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

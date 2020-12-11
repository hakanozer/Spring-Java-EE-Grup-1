package com.works.mvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.mvcjpa.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
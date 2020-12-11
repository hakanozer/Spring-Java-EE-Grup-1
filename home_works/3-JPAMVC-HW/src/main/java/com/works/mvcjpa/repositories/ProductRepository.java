package com.works.mvcjpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.works.mvcjpa.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query("select p from Product p where p.title like ?1")
	List<Product> searchData( String data );

}

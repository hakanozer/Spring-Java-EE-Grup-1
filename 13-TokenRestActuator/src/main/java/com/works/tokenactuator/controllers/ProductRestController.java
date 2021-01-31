package com.works.tokenactuator.controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.works.tokenactuator.services.ProductService;


@RestController
public class ProductRestController {

	final ProductService productService;
	public ProductRestController( ProductService productService ) {
		this.productService = productService;
	}
	
	@Cacheable("productList")
	@GetMapping("productList") 
	public Map<String, Object> productList() {
		Map<String, Object> hm = new LinkedHashMap<>();
		productService.productAdd();
		productService.productList();
		return hm;
	}
	
}

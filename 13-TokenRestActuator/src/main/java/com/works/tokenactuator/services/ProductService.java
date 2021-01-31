package com.works.tokenactuator.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.works.tokenactuator.entities.TokenJsonPush;
import com.works.tokenactuator.entities.product.Filter;
import com.works.tokenactuator.entities.product.LangCode;
import com.works.tokenactuator.entities.product.Locale;
import com.works.tokenactuator.entities.product.PageData;
import com.works.tokenactuator.entities.product.ProductCreateJsonPush;
import com.works.tokenactuator.entities.product.ProductJsonPush;
import com.works.tokenactuator.entities.product.Tr;

@Service
public class ProductService {
	
	final TokenService service;
	public ProductService( TokenService service ) {
		this.service = service;
	}

	public void productList() {
		
		String url = "http://cupofkids.com/api/restful/product/getList";
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Token", service.token());
		headers.set("Language", "tr");
		headers.set("Content-Type", "application/json");
		
		Filter filter = new Filter();
		filter.setSo("52");
		filter.setDisallowGroup(false);
		
		PageData pageData = new PageData();
		pageData.setStart("0");
		pageData.setLength("10");

		ProductJsonPush jsonPush = new ProductJsonPush();
		jsonPush.setFilter(filter);
		jsonPush.setPageData(pageData);
		
		HttpEntity<ProductJsonPush> request = new HttpEntity<>(jsonPush,headers );
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, request, String.class);
		System.out.println( responseEntity.getBody() );
		
	}
	
	
	public void productAdd() {
		
		String url = "http://cupofkids.com/api/restful/product/create";
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Token", service.token());
		headers.set("Language", "tr");
		headers.set("Content-Type", "application/json");
		
		ProductCreateJsonPush createJsonPush = new ProductCreateJsonPush();
		Locale locale = new Locale();
		Tr tr = new Tr();
		locale.setAdditionalProperty("tr", new ArrayList<>().add(tr));
		locale.setTr(tr);
		
		createJsonPush.setLocale(locale);

		createJsonPush.setSalePrice(100);
		createJsonPush.setCostPrice(100);
		createJsonPush.setCurrency("try");
		createJsonPush.setCostCurrency("try");
		createJsonPush.setCategory("110");
		List<String> ls = Arrays.asList("110");
		createJsonPush.setCategories(ls);
		createJsonPush.setSalePrice(12312);
		createJsonPush.setSku("test1234");
		createJsonPush.setAdditionalProperty("tr", new ArrayList<>());
		
		
		HttpEntity<ProductCreateJsonPush> request = new HttpEntity<>(createJsonPush,headers );
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, request, String.class);
		System.out.println( responseEntity.getBody() );
		
	}
	
	
}

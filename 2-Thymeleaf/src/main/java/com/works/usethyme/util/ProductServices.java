package com.works.usethyme.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.works.usethyme.props.Product;

@Configuration
public class ProductServices {
	
	@Bean(name = "source")
	public List<Product> result() {
		List<Product> ls = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Product pr = new Product();
			pr.setImg("pr.jpg");
			pr.setDesc("Some quick example text to build on the card title and make up the bulk of the card's content.");
			pr.setPrice(""+i);
			pr.setTitle("Card title - "+i );
			ls.add(pr);
		}
		return ls;
	}
	

}

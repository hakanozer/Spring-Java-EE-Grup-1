package com.works.usethyme.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.works.usethyme.props.Product;

@Configuration
public class ProductServices {

	@Bean(name="source")
	public List<Product> result()
	{
		List<Product> ls = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Product pr = new Product();
			pr.setTitle("Product : ");
			pr.setDesc(" Made in China." );
			pr.setPrice((i+13));
			
			ls.add(pr);
		}
		return ls;
	}
	
}

package com.works.ninedays.repositories;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import io.spring.guides.gs_producing_web_service.Scholl;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class SchoolRepository {
	private static final Map<String, Scholl> schools = new HashMap<>();

	@PostConstruct
	public void initData() {
		Scholl sc1 = new Scholl();
		sc1.setName("Ali");
		sc1.setPopulation(1000);
		sc1.setAddress("İstanbul / Beşiktaş");

		schools.put(sc1.getName(), sc1);
		
		Scholl sc2 = new Scholl();
		sc2.setName("Veli");
		sc2.setPopulation(2000);
		sc2.setAddress("İstanbul / Şişli");

		schools.put(sc2.getName(), sc2);
		
		
		Scholl sc3 = new Scholl();
		sc3.setName("Mehmet");
		sc3.setPopulation(2000);
		sc3.setAddress("İstanbul / Kadıköy");

		schools.put(sc3.getName(), sc3);

		
	}

	public Scholl findScholl(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return schools.get(name);
	}
}
package com.works.ninedays.soapclient;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;

@RestController
public class SoapClientRestController {
	
	@Autowired CountryClient client;
	
	@GetMapping("/restClient")
	public Map<String, Object> restClient( @RequestBody Country country ) {
		Map<String, Object> hm = new LinkedHashMap<>();
		
		 GetCountryResponse res =  client.getCountry(country.getName());
		 hm.put("status", true);
		 hm.put("result", res.getCountry());
		
		return hm;
	}

}

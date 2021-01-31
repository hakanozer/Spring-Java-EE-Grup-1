package com.works.userss.rssclient;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RssRestClientController {

	@Autowired RssRead read;
	
	@GetMapping("/ntvHot")
	public Map<String, Object> ntvHot() {
		Map<String, Object> hm = new LinkedHashMap<>();
		 hm.put("ntwHot", read.ntvNewsHot() );
		return hm;
	}
	
	
	
}

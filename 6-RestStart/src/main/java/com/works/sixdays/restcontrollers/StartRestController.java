package com.works.sixdays.restcontrollers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartRestController {

	
	@PostMapping("/allData")
	public Map<String, Object> allData() {
		Map<String, Object> hm = new HashMap<>();
		hm.put("status", true);
		hm.put("name", "Ali Bilmem");
		hm.put("age", 30);
		return hm;
	}
	
	
}

package com.works.eleven.useProfile;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdfileRestController {
	
	@Autowired ConfigProfile cProfile;
	
	@GetMapping("/profile")
	public Map<String, Object> profile() {
		Map<String, Object> hm = new LinkedHashMap<>();
		hm.put("status", true);
		hm.put("config", cProfile.config());
		return hm;
	}
	

}

package com.works.userss.xmlclient;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TCMBRestController {

	@Autowired TCMB tcmb;
	
	@GetMapping("/today")
	public Map<String, Object> today() {
		Map<String, Object> hm = new LinkedHashMap<>();
		hm.put("currencies", tcmb.todayXml() );
		return hm;
	}
	
}

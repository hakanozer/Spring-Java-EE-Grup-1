package com.works.eleven.useProfile;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class Product implements ConfigProfile {

	@Override
	public Map<CEnum, Object> config() {
		Map<CEnum, Object> hm = new HashMap<>();
		hm.put(CEnum.apiKey, "prod234234223sdfsdf");
		hm.put(CEnum.dbURL, "prodDBURL");
		hm.put(CEnum.DBUser, "prodDBUser");
		hm.put(CEnum.DBPass, "prodDBPass");
		return hm;
	}
	
	
}

package com.works.eleven.useProfile;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Development implements ConfigProfile {

	@Override
	public Map<CEnum, Object> config() {
		Map<CEnum, Object> hm = new HashMap<>();
		hm.put(CEnum.apiKey, "dev234234223sdfsdf");
		hm.put(CEnum.dbURL, "devDBURL");
		hm.put(CEnum.DBUser, "devDBUser");
		hm.put(CEnum.DBPass, "devDBPass");
		return hm;
	}

}

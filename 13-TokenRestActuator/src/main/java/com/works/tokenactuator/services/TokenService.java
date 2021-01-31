package com.works.tokenactuator.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.works.tokenactuator.entities.Options;
import com.works.tokenactuator.entities.TokenJsonPull;
import com.works.tokenactuator.entities.TokenJsonPush;

@Service
public class TokenService {
	
	String tkn = "";
	public String token() {
		
		if ( tkn.equals("") ) {
			String url = "http://cupofkids.com/api/restful/auth/generateToken";
			
			TokenJsonPush jsonPush = new TokenJsonPush();
			jsonPush.setUserName("rest");
			jsonPush.setPassword("123123");
			Options options = new Options();
			options.setToken(null);
			options.setPasswordHashed(false);
			jsonPush.setOptions(options);
			
			HttpHeaders headers = new HttpHeaders();
						
			HttpEntity<TokenJsonPush> request = new HttpEntity<>(jsonPush,headers );
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<TokenJsonPull> stData = restTemplate.postForEntity(url, request, TokenJsonPull.class);
			
			TokenJsonPull jsonPull = stData.getBody();
			
			tkn = jsonPull.getData().getToken();
			
			return tkn;
		
		}else {
			return tkn;
		}
		
	}

}

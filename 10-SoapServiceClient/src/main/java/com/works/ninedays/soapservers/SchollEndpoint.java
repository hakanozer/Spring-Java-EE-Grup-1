package com.works.ninedays.soapservers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.works.ninedays.repositories.SchoolRepository;

import io.spring.guides.gs_producing_web_service.GetSchollRequest;
import io.spring.guides.gs_producing_web_service.GetSchollyResponse;

@Endpoint
public class SchollEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private SchoolRepository schoolRepository;

	@Autowired
	public SchollEndpoint( SchoolRepository schoolRepository ) {
		this.schoolRepository = schoolRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSchollRequest")
	@ResponsePayload
	public GetSchollyResponse getCountry(@RequestPayload GetSchollRequest request) {
		GetSchollyResponse response = new GetSchollyResponse();
		response.setScholl(schoolRepository.findScholl(request.getName()));

		return response;
	}
}
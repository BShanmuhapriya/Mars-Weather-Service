package com.nasa.marsWetherService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
@Service

public class marsWetherService {
	 @Value("${nasa.api.url}")
	    private String nasaApiUrl;

	    public String getWeather() {
	        RestTemplate restTemplate = new RestTemplate();
	        String response = restTemplate.getForObject(nasaApiUrl, String.class);
	        return response;
	    }

}

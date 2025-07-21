package com.nasa.marsWetherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class marsWetherSerciveController {
	@Autowired
	private  marsWetherService marsWetherService;
	@GetMapping("/weather")
	public String getMarsWeather() {
		return marsWetherService.getWeather();
	}
	
}

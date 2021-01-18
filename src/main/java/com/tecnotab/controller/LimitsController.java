package com.tecnotab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotab.configuration.LimitsConfiguration;

@RestController
@RequestMapping("/limits")
public class LimitsController {

	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	@GetMapping
	public LimitsConfiguration getLimitsConfiguration() {
		return new LimitsConfiguration(limitsConfiguration.getMaximum(), limitsConfiguration.getMinimum());
	}
}

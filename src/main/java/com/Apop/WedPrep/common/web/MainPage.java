package com.Apop.WedPrep.common.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
public class MainPage {
	
	@GetMapping("/test")
	public String getHi() {
		return "Hi";
	}
}

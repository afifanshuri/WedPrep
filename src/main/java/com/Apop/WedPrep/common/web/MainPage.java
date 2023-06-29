package com.Apop.WedPrep.common.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainPage {
	
	@RequestMapping("/test")
	public String getHi() {
		return "Hi";
	}
}

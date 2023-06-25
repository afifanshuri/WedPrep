package com.Apop.WedPrep.common.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {
	
	@RequestMapping(name = "/hi")
	public String getHi() {
		return "Hi";
	}
}

package com.Apop.WedPrep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WedPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(WedPrepApplication.class, args);
	}
	
	 @RequestMapping(value = "/")
	    public String index() {
	        return "index.html";
	   }

}

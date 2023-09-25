package com.Apop.WedPrep.common.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Apop.WedPrep.common.domain.Catering;
import com.Apop.WedPrep.common.serviceImpl.CateringService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/catering")
public class CateringController {
	
	@Autowired
	CateringService cateringService;
	
	@RequestMapping("/")
	public String helloWorld() {
		return "Started catering controller!";
	}
	
	@RequestMapping("/caterings")
	public List<Catering> getCateringList(){
		return cateringService.getCateringList();
	}
	
	@PostMapping("/add")
	public String addCatering(@RequestBody Catering catering) {
		cateringService.addCatering(catering);
		return "Catering added";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCatering(@PathVariable("id") Long id) {
		cateringService.deleteCatering(id);
		return "Catering deleted";
	}
	
	@RequestMapping("/{id}")
	public Catering getCateringById(@PathVariable("id") Long id) {
		return cateringService.getCateringById(id);
	}
}

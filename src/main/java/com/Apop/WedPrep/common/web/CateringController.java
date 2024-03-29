package com.Apop.WedPrep.common.web;

import java.util.List;

import javax.swing.Spring;

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
import com.Apop.WedPrep.common.domain.Menu;
import com.Apop.WedPrep.common.dto.CreateCateringDTO;
import com.Apop.WedPrep.common.service.IMenuService;
import com.Apop.WedPrep.common.serviceImpl.CateringService;
import com.Apop.WedPrep.common.serviceImpl.MenuService;
import com.Apop.WedPrep.config.RouterConfig;

@RestController
@CrossOrigin(origins = RouterConfig.FE_URL)
@RequestMapping(RouterConfig.BASE_URL + RouterConfig.CATERING_BASE_URL)
public class CateringController {
	
	@Autowired
	CateringService cateringService;
	
	@RequestMapping(RouterConfig.VIEW)
	public List<Catering> getCateringList(){
		return cateringService.getCateringList();
	}
	
	@RequestMapping(RouterConfig.VIEW + "/{id}")
	public Catering getCateringDetails(@PathVariable("id") Long id){
		return cateringService.getCateringById(id);
	}
	
	@PostMapping(RouterConfig.ADD)
	public String addCatering(@RequestBody CreateCateringDTO cateringDTO) {
		cateringService.addCatering(cateringDTO);
		return "Catering added";
	}
	
	
	@DeleteMapping(RouterConfig.DELETE + "/{id}")
	public String deleteCatering(@PathVariable("id") Long id) {
		cateringService.deleteCatering(id);
		return "Catering deleted";
	}

}

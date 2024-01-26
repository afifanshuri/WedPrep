package com.Apop.WedPrep.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apop.WedPrep.common.domain.Catering;
import com.Apop.WedPrep.common.domain.Menu;
import com.Apop.WedPrep.common.dto.CreateCateringDTO;
import com.Apop.WedPrep.common.repository.CateringRepository;
import com.Apop.WedPrep.common.service.ICateringService;
import com.Apop.WedPrep.common.util.SpringUtil;

import jakarta.annotation.PostConstruct;

@Service
public class CateringService extends BaseService implements ICateringService{
	
	@Autowired
	private CateringRepository cateringRepository;
	
	@PostConstruct
	private void initData() {
		
	}
	

	@Override
	public List<Catering> getCateringList() {
		return cateringRepository.findAll();
	}

	@Override
	public void addCatering(CreateCateringDTO cateringDTO) {
		Catering catering = cateringDTO.getCateringObj();
		Menu menu = cateringDTO.getMenuObj();
		Catering savedCatering = cateringRepository.save(catering);		
		MenuService menuService = getSpringUtil().getBean(MenuService.class);
		menu.setCatering(savedCatering);
		menuService.addMenu(menu);
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void deleteCatering(Long id) {
		// TODO Auto-generated method stub
		cateringRepository.deleteById(id);
	}

	@Override
	public Catering getCateringById(Long id) {
		// TODO Auto-generated method stub
		return cateringRepository.findById(id).get();
	}

}

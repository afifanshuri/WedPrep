package com.Apop.WedPrep.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apop.WedPrep.common.domain.Catering;
import com.Apop.WedPrep.common.repository.CateringRepository;
import com.Apop.WedPrep.common.service.ICateringService;

@Service
public class CateringService extends BaseService implements ICateringService{
	
	@Autowired
	private CateringRepository cateringRepository;
	

	@Override
	public List<Catering> getCateringList() {
		return cateringRepository.findAll();
	}

	@Override
	public void addCatering(Catering catering) {
		// TODO Auto-generated method stub
		cateringRepository.save(catering);
		
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

package com.Apop.WedPrep.common.service;

import java.util.List;

import com.Apop.WedPrep.common.domain.Catering;
import com.Apop.WedPrep.common.dto.CreateCateringDTO;

public interface ICateringService {
	public List<Catering> getCateringList();
	public void deleteCatering(Long id);
	public Catering getCateringById(Long id);
	void addCatering(CreateCateringDTO catering);
}

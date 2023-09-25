package com.Apop.WedPrep.common.service;

import java.util.List;

import com.Apop.WedPrep.common.domain.Catering;

public interface ICateringService {
	public List<Catering> getCateringList();
	public void addCatering(Catering catering);
	public void deleteCatering(Long id);
	public Catering getCateringById(Long id);
}

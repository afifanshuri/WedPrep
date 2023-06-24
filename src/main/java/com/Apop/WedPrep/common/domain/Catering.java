package com.Apop.WedPrep.common.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "CATERING")
public class Catering {

	@Id
	private Long id;
	private String cateringName;
	private List<String> menu;
}

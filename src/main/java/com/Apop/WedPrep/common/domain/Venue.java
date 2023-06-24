package com.Apop.WedPrep.common.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "VENUE")
public class Venue {

	@Id
	private Long id;
	private String venueName;
	private String link;

}

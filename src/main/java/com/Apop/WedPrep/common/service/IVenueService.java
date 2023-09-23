package com.Apop.WedPrep.common.service;

import com.Apop.WedPrep.common.domain.Venue;

public interface IVenueService {
	
	public Venue findVenueById(Long id);
	public void addVenue(Venue venue);
	public void deleteVenue(Venue venue);
	
}

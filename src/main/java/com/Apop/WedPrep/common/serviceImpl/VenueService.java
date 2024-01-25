package com.Apop.WedPrep.common.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apop.WedPrep.common.domain.Venue;
import com.Apop.WedPrep.common.repository.VenueRepository;
import com.Apop.WedPrep.common.service.IVenueService;

@Service
public class VenueService extends BaseService implements IVenueService{
	@Autowired 
	private VenueRepository venueRepository;

	@Override
	public Venue findVenueById(Long id) {
		// TODO Auto-generated method stub
		return venueRepository.findById(id).get();
	}

	@Override
	public void addVenue(Venue venue) {
		// TODO Auto-generated method stub
		venueRepository.save(venue);
		
	}

	@Override
	public void deleteVenue(Venue venue) {
		// TODO Auto-generated method stub
		venueRepository.delete(venue);
		
	}
}

package com.Apop.WedPrep.common.domain;

import com.Apop.WedPrep.common.constant.DomainConstant;
import com.Apop.WedPrep.common.listener.BaseEntityListener;
import com.Apop.WedPrep.config.RouterConfig;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = DomainConstant.BASE_PRFX + DomainConstant.LOCATION_TABLE_NAME)
@EntityListeners(BaseEntityListener.class)
public class Location extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="locationSequenceGenerator")
	@SequenceGenerator(name="locationSequenceGenerator",sequenceName="SEQ_LOCATION",allocationSize=1)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "state_id")
	private State state;
	
	@OneToOne
	@JoinColumn(name = "district_id")
	private District district;
	
	@OneToOne(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Catering catering;
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}

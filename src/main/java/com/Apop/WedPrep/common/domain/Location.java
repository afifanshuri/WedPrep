package com.Apop.WedPrep.common.domain;

import com.Apop.WedPrep.common.constant.DomainConstant;
import com.Apop.WedPrep.common.listener.BaseEntityListener;
import com.Apop.WedPrep.config.RouterConfig;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private String state;
	private String district;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
}

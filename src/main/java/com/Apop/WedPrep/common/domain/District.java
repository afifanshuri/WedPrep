package com.Apop.WedPrep.common.domain;

import com.Apop.WedPrep.common.constant.DomainConstant;
import com.Apop.WedPrep.common.listener.BaseEntityListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = DomainConstant.BASE_PRFX + DomainConstant.DISTRICT_TABLE_NAME)
@EntityListeners(BaseEntityListener.class)
public class District extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="districtSequenceGenerator")
	@SequenceGenerator(name="districtSequenceGenerator",sequenceName="SEQ_DISTRICT",allocationSize=1)
	private Long id;
	private String districtCode;
	private String districtName;
	
	@OneToOne
	@JoinColumn(name = "state_id")
	private State state;
	
	@OneToOne(mappedBy = "district",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Location location;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
}

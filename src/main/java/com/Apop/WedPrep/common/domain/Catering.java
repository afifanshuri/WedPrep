package com.Apop.WedPrep.common.domain;

import java.util.List;

import com.Apop.WedPrep.common.constant.CommonConstant;
import com.Apop.WedPrep.common.constant.DomainConstant;
import com.Apop.WedPrep.common.listener.BaseEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = DomainConstant.BASE_PRFX + DomainConstant.CATERING_TABLE_NAME)
@EntityListeners(BaseEntityListener.class)
public class Catering extends BaseEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cateringSequenceGenerator")
	@SequenceGenerator(name="cateringSequenceGenerator",sequenceName="SEQ_CATERING",allocationSize=1)
	private Long id;
	private String cateringName;
	private String menu;
	private String address;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCateringName() {
		return cateringName;
	}
	public void setCateringName(String cateringName) {
		this.cateringName = cateringName;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

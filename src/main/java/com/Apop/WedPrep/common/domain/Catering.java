package com.Apop.WedPrep.common.domain;

import java.util.List;

import com.Apop.WedPrep.common.constant.CommonConstant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = CommonConstant.BASE_PRFX + "CATERING")
public class Catering extends BaseEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cateringSequenceGenerator")
	@SequenceGenerator(name="cateringSequenceGenerator",sequenceName="SEQ_CATERING",allocationSize=1)
	private Long id;
	private String cateringName;
	private List<String> menu;
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
	public List<String> getMenu() {
		return menu;
	}
	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	
	
}

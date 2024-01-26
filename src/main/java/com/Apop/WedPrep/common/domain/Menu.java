package com.Apop.WedPrep.common.domain;

import java.math.BigDecimal;
import java.util.Map;

import com.Apop.WedPrep.common.constant.DomainConstant;
import com.Apop.WedPrep.common.listener.BaseEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = DomainConstant.BASE_PRFX + DomainConstant.MENU_TABLE_NAME)
@EntityListeners(BaseEntityListener.class)
public class Menu extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="menuSequenceGenerator")
	@SequenceGenerator(name="menuSequenceGenerator",sequenceName="SEQ_MENU",allocationSize=1)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="catering_id")
	private Catering catering;
	private String menuDetails;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Catering getCatering() {
		return catering;
	}
	public void setCatering(Catering catering) {
		this.catering = catering;
	}
	public String getMenu() {
		return menuDetails;
	}
	public void setMenu(String menuDetails) {
		this.menuDetails = menuDetails;
	}

	
}

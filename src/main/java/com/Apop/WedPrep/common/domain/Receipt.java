package com.Apop.WedPrep.common.domain;

import com.Apop.WedPrep.common.constant.CommonConstant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = CommonConstant.BASE_PRFX + "RECEIPT")
public class Receipt extends BaseEntity{

	@Id
	private Long id;
	private String venueName;
	private String link;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	

}

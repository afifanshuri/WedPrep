package com.Apop.WedPrep.common.domain;

import java.math.BigDecimal;

import com.Apop.WedPrep.common.constant.CommonConstant;
import com.Apop.WedPrep.common.constant.DomainConstant;
import com.Apop.WedPrep.common.listener.BaseEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = DomainConstant.BASE_PRFX + DomainConstant.RECEIPT_TABLE_NAME)
@EntityListeners(BaseEntityListener.class)
public class Receipt extends BaseEntity{

	@Id
	private Long id;
	private String receiptNumber;
	private String link;
	private BigDecimal amount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	

}

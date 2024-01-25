package com.Apop.WedPrep.common.listener;

import com.Apop.WedPrep.common.domain.BaseEntity;
import com.Apop.WedPrep.common.util.DateUtil;

import jakarta.persistence.PrePersist;

public class BaseEntityListener {
	
	@PrePersist
	public void preSave(BaseEntity baseEntity) {
		baseEntity.setCreatedDate(DateUtil.getDate());
		baseEntity.setCreatedBy("SYSTEM");
		baseEntity.setLastModifiedDate(DateUtil.getDate());
		baseEntity.setLastModifiedBy("SYSTEM");
		if(baseEntity.getVersion() != null) {
			baseEntity.setVersion(baseEntity.getVersion() + 1);
		} else {
			baseEntity.setVersion(Long.parseLong("1"));
		}
	}
}

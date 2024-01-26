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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = DomainConstant.BASE_PRFX + DomainConstant.STATE_TABLE_NAME)
@EntityListeners(BaseEntityListener.class)
public class State extends BaseEntity{
		
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="stateSequenceGenerator")
		@SequenceGenerator(name="stateSequenceGenerator",sequenceName="SEQ_STATE",allocationSize=1)
		private Long id;
		private String stateCode;
		private String stateName;
		
		@OneToOne(mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		private District district;
		
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getStateCode() {
			return stateCode;
		}
		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

}

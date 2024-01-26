package com.Apop.WedPrep.common.dto;

import com.Apop.WedPrep.common.domain.Catering;
import com.Apop.WedPrep.common.domain.Menu;

public class CreateCateringDTO {
	private Catering cateringObj;
	private Menu menuObj;
	
	public Catering getCateringObj() {
		return cateringObj;
	}
	public void setCateringObj(Catering cateringObj) {
		this.cateringObj = cateringObj;
	}
	public Menu getMenuObj() {
		return menuObj;
	}
	public void setMenuObj(Menu menuObj) {
		this.menuObj = menuObj;
	}
}

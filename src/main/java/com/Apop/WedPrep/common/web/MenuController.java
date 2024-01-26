package com.Apop.WedPrep.common.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Apop.WedPrep.common.domain.Menu;
import com.Apop.WedPrep.common.service.IMenuService;
import com.Apop.WedPrep.common.serviceImpl.MenuService;
import com.Apop.WedPrep.config.RouterConfig;

@RestController
@CrossOrigin(origins = RouterConfig.FE_URL)
@RequestMapping(RouterConfig.BASE_URL + RouterConfig.MENU_BASE_URL)
public class MenuController {
	
	@PostMapping(RouterConfig.ADD)
	public Long addMenu(@RequestBody Menu menu) {
		return getMenuService().addMenu(menu);
	}
	
	public IMenuService getMenuService() {
		IMenuService menuService = new MenuService();
		return menuService;
	}
}

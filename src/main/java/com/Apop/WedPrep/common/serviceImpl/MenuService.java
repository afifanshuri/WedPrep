package com.Apop.WedPrep.common.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Apop.WedPrep.common.domain.Menu;
import com.Apop.WedPrep.common.repository.MenuRepository;
import com.Apop.WedPrep.common.service.IMenuService;

@Service
public class MenuService extends BaseService implements IMenuService{
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public Long addMenu(Menu menu) {
		Menu savedMenu = menuRepository.save(menu);
		return savedMenu.getId();
	}
}

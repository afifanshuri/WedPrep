package com.Apop.WedPrep.common.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apop.WedPrep.common.util.SpringUtil;

@Service
public class BaseService {
	
	@Autowired
	private SpringUtil springUtil;

	public SpringUtil getSpringUtil() {
		return springUtil;
	}

	public void setSpringUtil(SpringUtil springUtil) {
		this.springUtil = springUtil;
	}
	
	
}

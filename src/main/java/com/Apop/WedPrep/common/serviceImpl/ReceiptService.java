package com.Apop.WedPrep.common.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apop.WedPrep.common.repository.ReceiptRepository;
import com.Apop.WedPrep.common.service.BaseService;
import com.Apop.WedPrep.common.service.IReceiptService;

@Service
public class ReceiptService extends BaseService implements IReceiptService{
	
	@Autowired
	private ReceiptRepository receiptRepository;
	

}

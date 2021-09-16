package com.ucs.hrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.hrms.repo.HRMSRepository;

@Service("lmService")
public class HRMSServiceImpl implements HRMSService {

	@Autowired
	HRMSRepository lmRepo;
	
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		System.out.println("LMServiceImpl.getValue() value"+lmRepo.getValue());
		return lmRepo.getValue();
	}

}

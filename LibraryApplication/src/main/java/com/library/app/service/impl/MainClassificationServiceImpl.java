package com.library.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.library.app.entity.MainClassification;
import com.library.app.repository.MainClassificationRepository;
import com.library.app.service.MainClassificationService;

public class MainClassificationServiceImpl implements MainClassificationService {
	
	@Autowired
	MainClassificationRepository mainClassRepository;

	@Override
	public MainClassification getMainClassificationById(Long mainClassId) {

		return mainClassRepository.findByMainClassId(mainClassId);
	}

	@Override
	public MainClassification save(MainClassification mainClass) {
		return mainClassRepository.save(mainClass);
	}

	@Override
	public List<MainClassification> getAllMainClassificationList() {
		return mainClassRepository.findAll();
	}

	@Override
	public MainClassification deleteMainClassificationById(Long mainClassId) {
		 mainClassRepository.deleteById(mainClassId);
		 return null;
	}

	@Override
	public void updateMainClassification(MainClassification mainClass) {
		Long mainClassId = mainClass.getMainClassId();
		boolean isExist = mainClassRepository.findByMainClassId(mainClassId) != null;
		if (isExist) {
			mainClassRepository.save(mainClass);
		}
		
	}

}

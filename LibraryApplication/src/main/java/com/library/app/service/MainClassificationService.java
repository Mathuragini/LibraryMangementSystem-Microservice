package com.library.app.service;

import java.util.List;

import com.library.app.entity.MainClassification;

public interface MainClassificationService {
	
	MainClassification getMainClassificationById(Long mainClassId);
	MainClassification save(MainClassification mainClass);
	List<MainClassification> getAllMainClassificationList();
	MainClassification deleteMainClassificationById(Long mainClassId);
	void updateMainClassification(MainClassification mainClass);

}

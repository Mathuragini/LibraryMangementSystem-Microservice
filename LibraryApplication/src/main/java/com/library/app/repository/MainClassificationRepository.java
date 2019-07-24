package com.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.entity.MainClassification;

public interface MainClassificationRepository extends JpaRepository<MainClassification, Long> {

	MainClassification findByMainClassId(Long mainClassId);

}

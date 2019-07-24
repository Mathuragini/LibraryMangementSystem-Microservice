package com.library.app.dto.converter;

import java.util.ArrayList;
import java.util.List;

import com.library.app.dto.MainClassificationDTO;
import com.library.app.entity.MainClassification;

public class MainClassificationConverter {

	// To list all main classification details
	public static List<MainClassificationDTO> EntityToDTO(List<MainClassification> mainClassList) {

		if (mainClassList != null) {
			List<MainClassificationDTO> defectDTOlist = new ArrayList<>();
			for (MainClassification mainClass : mainClassList) {

				MainClassificationDTO mainClassDTO = new MainClassificationDTO();

				mainClassDTO.setMainClassId(mainClass.getMainClassId());
				mainClassDTO.setMainClassName(mainClass.getMainClassName());
				defectDTOlist.add(mainClassDTO);

			}
			return defectDTOlist;
		}
		return null;
	}

	// To convert MainClassificationEntity to MainClassificationDTO
	@SuppressWarnings("unused")
	public static MainClassificationDTO EntityToDTO(MainClassification mainClass) {
		MainClassificationDTO mainClassDTO = new MainClassificationDTO();

		if (mainClassDTO != null) {

			mainClassDTO.setMainClassId(mainClass.getMainClassId());
			mainClassDTO.setMainClassName(mainClass.getMainClassName());
			return mainClassDTO;
		}
		return null;
	}
	
	//To convert MainClassificationDTO into MainClassificationEntity
	public static MainClassification DTOToEntity(MainClassificationDTO mainClassDTO) {
		MainClassification mainClass = new MainClassification();
		if (mainClassDTO != null) {

			mainClass.setMainClassId(mainClassDTO.getMainClassId());
			mainClass.setMainClassName(mainClassDTO.getMainClassName());
			return mainClass;
		}
		return null;
	}

}

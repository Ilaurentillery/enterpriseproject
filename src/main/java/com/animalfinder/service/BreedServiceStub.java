package com.animalfinder.service;

import org.springframework.stereotype.Component;

import com.animalfinder.dto.BreedDTO;

@Component
public class BreedServiceStub {

	public BreedDTO fetchByID(int id) {
		BreedDTO breedDTO = new BreedDTO();
		breedDTO.setBreedID(43);
		return breedDTO;
	}
	public void save(BreedDTO breedDTO) {
		
	}
	
}

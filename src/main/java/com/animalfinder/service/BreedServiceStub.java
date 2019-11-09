package com.animalfinder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.animalfinder.dto.BreedDTO;

@Component
public class BreedServiceStub implements IBreedService {

	@Override
	public BreedDTO fetchByID(int id) {
		BreedDTO breedDTO = new BreedDTO();
		breedDTO.setBreedID(43);
		breedDTO.setLatitude("Ohio");
		breedDTO.setLongitude("Cincinnati");
		breedDTO.setName("Wolf");
		breedDTO.setShelter("Palms");
		breedDTO.setGender("Male");
		
		return breedDTO;
	}
	@Override
	public void save(BreedDTO breedDTO) {
		
	}
	@Override
	public List<BreedDTO> fetchAnimals(String searchTerm) {
		//stub out animal search
		List<BreedDTO> matchingAnimals = new ArrayList<BreedDTO>();
		
				
		if(searchTerm.contains("orgi") || searchTerm.contains("anis")) {
		BreedDTO animal = new BreedDTO();
		animal.setGender("Canis");
		animal.setName("Corgi");
		
		matchingAnimals.add(animal);
		
		}
		
		return matchingAnimals;
	}
	
}

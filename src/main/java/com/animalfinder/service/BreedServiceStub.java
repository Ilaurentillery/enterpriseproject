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
		breedDTO.setLatitude(12.5);
		breedDTO.setLongitude(30.2);
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
		
				
		if(searchTerm.contains("corgi") || searchTerm.contains("dog")) {
		BreedDTO animal = new BreedDTO();
		animal.setBreedID(11);
		animal.setLatitude(30.2);
		
		matchingAnimals.add(animal);
		
		}
		
		return matchingAnimals;
	}
	
}

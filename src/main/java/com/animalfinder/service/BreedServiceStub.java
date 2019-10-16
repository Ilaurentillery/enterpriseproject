package com.animalfinder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;

@Component
public class BreedServiceStub implements IBreedService {

	@Override
	public BreedDTO fetchByID(int id) {
		BreedDTO breedDTO = new BreedDTO();
		breedDTO.setBreedId(43);
		return breedDTO;
	}
	@Override
	public void save(BreedDTO breedDTO) {
		
	}
	@Override
	public List<AnimalDTO> fetchAnimals(String searchTerm) {
		//stub out animal search
		List<AnimalDTO> matchingAnimals = new ArrayList<AnimalDTO>();
		
				
		if(searchTerm.contains("orgi") || searchTerm.contains("anis")) {
		AnimalDTO animal = new AnimalDTO();
		animal.setGenus("Canis");
		animal.setBreed("Corgi");
		
		matchingAnimals.add(animal);
		
		}
		
		return matchingAnimals;
	}
	
}

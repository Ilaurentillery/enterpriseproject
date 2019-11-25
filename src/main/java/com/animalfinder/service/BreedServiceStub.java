package com.animalfinder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;

@Component
public class BreedServiceStub implements IBreedService {

	@Override
	public AnimalDTO fetchByID(int id) {
		AnimalDTO animalDTO = new AnimalDTO();
		animalDTO.setBreedID(43);
		animalDTO.setName("Wolf");
		animalDTO.setShelter("Palms");
		animalDTO.setSize("Small");
		animalDTO.setGender("Male");

		
		return animalDTO;
	}
	
	@Override
	public void save(AnimalDTO animalDTO) throws Exception{
		
	}
	@Override
	public List<BreedDTO> fetchBreed(String searchTerm) {
		//stub out animal search
		List<BreedDTO> matchingAnimals = new ArrayList<BreedDTO>();
		
				
		if(searchTerm.contains("corgi") || searchTerm.contains("dog")) {
		BreedDTO animal = new BreedDTO();
		animal.setBreedID(11);

		
		matchingAnimals.add(animal);
		
		}
		
		return matchingAnimals;
	}
	
}

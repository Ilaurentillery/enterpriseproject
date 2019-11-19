package com.animalfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dao.IAnimalDAO;
import com.animalfinder.dto.BreedDTO;

@Component
public class BreedService implements IBreedService {

	@Autowired
	IAnimalDAO animalDAO;
	
	@Override
	public BreedDTO fetchByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(BreedDTO breedDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BreedDTO> fetchAnimals(String searchTerm) throws Exception {
		// TODO Auto-generated method stub
		return animalDAO.fetch(searchTerm );
		
	}

}

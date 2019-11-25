package com.animalfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dao.IAnimalDAO;
import com.animalfinder.dao.IBreedDAO;
import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;

@Component
public class BreedService implements IBreedService {

	@Autowired
	IBreedDAO breedDAO;
	
	@Autowired
	IAnimalDAO animalDAO;
	
	@Override
	public AnimalDTO fetchByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(AnimalDTO animalDTO) throws Exception {
		
		animalDAO.save(animalDTO);
		// TODO Auto-generated method stub

	}

	@Override
	public List<BreedDTO> fetchBreed(String searchTerm) throws Exception {
		// TODO Auto-generated method stub
		return breedDAO.fetch("Oak");
		
	}

}

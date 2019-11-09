package com.animalfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.animalfinder.dao.IBreedDAO;
import com.animalfinder.dao.IFetchDAO;

import com.animalfinder.dto.BreedDTO;

public class BreedService implements IBreedService {

	@Autowired
	IFetchDAO breedDAO;
	
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
	public List<BreedDTO> fetchAnimals(String string) throws Exception {
		// TODO Auto-generated method stub
		return breedDAO.fetch("BLACKJACK");
		
	}

}

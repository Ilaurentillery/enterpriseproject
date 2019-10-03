package com.animalfinder.dao;

import com.animalfinder.dto.BreedDTO;

public interface IBreedDAO {

	boolean save(BreedDTO breedDTO) throws Exception;
	
	
}

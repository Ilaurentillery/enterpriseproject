package com.animalfinder.service;

import java.util.List;


import com.animalfinder.dto.BreedDTO;

public interface IBreedService {

	BreedDTO fetchByID(int id);

	void save(BreedDTO breedDTO);
	
	/**
	 * returns a list of animals containing this string
	 * @param string
	 * @return
	 */

	List<BreedDTO> fetchAnimals(String string) throws Exception;

}
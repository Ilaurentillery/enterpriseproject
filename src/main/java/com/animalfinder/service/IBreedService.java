package com.animalfinder.service;

import java.util.List;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;

public interface IBreedService {

	AnimalDTO fetchByID(int id);

	void save(AnimalDTO animalDTO) throws Exception;
	
	/**
	 * returns a list of animals containing this string
	 * @param string
	 * @return
	 */
	
	

	List<BreedDTO> fetchBreed(String string)throws Exception;

}
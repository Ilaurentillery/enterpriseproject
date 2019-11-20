package com.animalfinder.dao;

import com.animalfinder.dto.AnimalDTO;

public interface IAnimalDAO {
	
	boolean save(AnimalDTO animalDTO) throws Exception;
	

}

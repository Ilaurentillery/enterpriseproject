package com.animalfinder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dto.AnimalDTO;

@Component
public class AnimalDAO implements IAnimalDAO {
	
	@Autowired
	AnimalRepository animalRepository;
	
	@Override
	public boolean save(AnimalDTO animalDTO) throws Exception {
		// TODO Auto-generated method stub
		animalRepository.save(animalDTO);
		
		return false;
	}

}

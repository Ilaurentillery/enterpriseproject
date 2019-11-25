package com.animalfinder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.animalfinder.dto.AnimalDTO;

@Component
public interface AnimalRepository extends CrudRepository<AnimalDTO, Integer> {

}

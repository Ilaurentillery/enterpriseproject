package com.animalfinder.dao;

import java.util.List;

import com.animalfinder.dto.BreedDTO;

public interface IAnimalDAO {

	List<BreedDTO> fetch(String searchFilter) throws Exception;

}
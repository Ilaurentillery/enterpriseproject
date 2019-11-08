package com.animalfinder.dao;

import java.util.List;

import com.animalfinder.dto.BreedDTO;

public interface IFetchDAO {

	List<BreedDTO> fetch(String searchFilter) throws Exception;

}
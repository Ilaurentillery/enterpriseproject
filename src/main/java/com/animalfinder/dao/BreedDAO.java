package com.animalfinder.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dto.BreedDTO;

@Component
public class BreedDAO implements IFetchDAO {
	@Autowired
	NetworkDAO networkDAO;
	
	@Override
	public List<BreedDTO> fetch(String searchFilter) throws Exception{
		List<BreedDTO> allBreeds = new ArrayList<BreedDTO>();
	
		networkDAO.request("json file goes here ");
		
		return allBreeds;
}
}

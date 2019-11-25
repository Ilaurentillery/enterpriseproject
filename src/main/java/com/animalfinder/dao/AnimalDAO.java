package com.animalfinder.dao;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;

@Component
public class AnimalDAO implements IAnimalDAO {
	
	@Autowired
	AnimalRepository animalRepository;
	
	@Autowired
	NetworkDAO networkDAO;
	
	public List<BreedDTO> fetchManual(String searchFilter) throws Exception{
		
		List<BreedDTO> allAnimals = new ArrayList<BreedDTO>();
		String rawJson = networkDAO.request("http://www.json-generator.com/api/json/get/cfPHxhqJKa?indent=2");
		
		JSONObject root = new JSONObject(rawJson);
		
		JSONArray animals = root.getJSONArray("JSON");
		
		for (int i = 0; i < animals.length(); i++) {
			//the json data
			JSONObject jsonAnimal = animals.getJSONObject(i);
			//Animal object that will be populated with the json
			BreedDTO breed = new BreedDTO();
			int BreedID = jsonAnimal.getInt("BreedID");
			int age = jsonAnimal.getInt("age");
			String size = jsonAnimal.getString("size");
			String shelter = jsonAnimal.getString("shelter");
			String gender = jsonAnimal.getString("gender");
			String name = jsonAnimal.getString("name");
			
			
			//populate DTO
			
			breed.setAge(age);
			
			breed.setBreedID(BreedID);
			breed.setGender(gender);
			breed.setShelter(shelter);
			breed.setName(name);
			
			allAnimals.add(breed);
		}
		
		return allAnimals;
		
	}


	@Override
	public boolean save(AnimalDTO animalDTO) throws Exception {
		// TODO Auto-generated method stub
		animalRepository.save(animalDTO);
		
		return false;
	}

}

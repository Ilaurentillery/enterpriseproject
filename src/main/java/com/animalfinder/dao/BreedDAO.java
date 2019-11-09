package com.animalfinder.dao;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dto.BreedDTO;

@Component
public class BreedDAO implements IFetchDAO {
	@Autowired
	NetworkDAO networkDAO;
	
	@Override
	public List<BreedDTO> fetch(String searchFilter) throws Exception{
		List<BreedDTO> allAnimals = new ArrayList<BreedDTO>();
	
		String rawJson = networkDAO.request("https://data.montgomerycountymd.gov/api/views/e54u-qx42/rows.json?accessType=DOWNLOAD");
		
		JSONObject root = new JSONObject(rawJson);
		
		JSONArray animals = root.getJSONArray("data");
		
		for(int i = 0; i< animals.length(); i++) {
		//the json data
		JSONObject jsonanimal = animals.getJSONObject(i);
		//plant object that is populated by json
		BreedDTO animal = new BreedDTO();
		int age = jsonanimal.getInt("13");
		String name = jsonanimal.getString("11");
		String breed = jsonanimal.getString("16");
		String color = jsonanimal.getString("15");
		
		//populate the dto
		animal.setBreed(breed);
		animal.setAge(age);
		animal.setColor(color);
		animal.setName(name);
		
		//add the populated animal to our collection
		allAnimals.add(animal);
		
		}
		
		
		
		return allAnimals;
}
}

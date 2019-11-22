package com.animalfinder.dao;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.animalfinder.dto.BreedDTO;
import com.animalfinder.dto.BreedList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class BreedDAO implements IBreedDAO{

	
	@Autowired
	NetworkDAO networkDAO;
	
public List<BreedDTO> fetchManual(String searchFilter) throws Exception{
		
		List<BreedDTO> allBreeds = new ArrayList<BreedDTO>();
		String rawJson = networkDAO.request("http://www.json-generator.com/api/json/get/cePuXvYdea?indent=2");
		
		JSONObject root = new JSONObject(rawJson);
		
		JSONArray breeds = root.getJSONArray("breeds");
		
		for (int i = 0; i < breeds.length(); i++) {
			//the json data
			JSONObject jsonBreed = breeds.getJSONObject(i);
			//Breed object that will be populated with the json
			BreedDTO breed = new BreedDTO();
			int breedID = jsonBreed.getInt("breedID");
			String shelter = jsonBreed.getString("shelter");
			String gender = jsonBreed.getString("gender");
			String size = jsonBreed.getString("size");
			String name = jsonBreed.getString("name");
			
			//populate DTO with this information
			
			breed.setBreedID(breedID);
			breed.setGender(gender);
			breed.setShelter(shelter);
			breed.setSize(size);
			breed.setName(name);
			
			allBreeds.add(breed);
		}
		
		return allBreeds;
		
	}

	@Override
	public List<BreedDTO> fetch(String searchFilter) throws Exception {
		// TODO Auto-generated method stub
		Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.json-generator.com/api/json/get/cePuXvYdea?indent=2")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		GetBreeds getBreeds = retrofit.create(GetBreeds.class);
		
		Call<BreedList> allBreeds = getBreeds.getAllBreeds(searchFilter);
		
		Response<BreedList> execute = allBreeds.execute();
		
		BreedList BreedList = execute.body();
		
		List<BreedDTO> breeds = BreedList.getAnimals();
		
		return breeds;
		
	}
}

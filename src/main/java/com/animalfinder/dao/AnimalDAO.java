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
public class AnimalDAO implements IAnimalDAO {
	
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
			double latitude = jsonAnimal.getDouble("latitude");
			double longitude = jsonAnimal.getDouble("longitude");
			String shelter = jsonAnimal.getString("shelter");
			String gender = jsonAnimal.getString("gender");
			String name = jsonAnimal.getString("name");
			
			//populate DTO
			
			breed.setBreedID(BreedID);
			breed.setLatitude(latitude);
			breed.setLongitude(longitude);
			breed.setGender(gender);
			breed.setShelter(shelter);
			breed.setName(name);
			
			allAnimals.add(breed);
		}
		
		return allAnimals;
		
	}

	@Override
	public List<BreedDTO> fetch(String searchFilter) throws Exception {
		// TODO Auto-generated method stub
		Retrofit retrofit = new Retrofit.Builder().baseUrl("http://NeedToMakeJSONData.com")
				.addConverterFactory(GsonConverterFactory.create())
				.build();
		
		GetAnimals getAnimals = retrofit.create(GetAnimals.class);
		
		Call<BreedList> allAnimals = getAnimals.getAllAnimals(searchFilter);
		
		Response<BreedList> execute = allAnimals.execute();
		
		BreedList animalList = execute.body();
		
		List<BreedDTO> animals = animalList.getAnimals();
		
		return animals;
		
	}
	

}

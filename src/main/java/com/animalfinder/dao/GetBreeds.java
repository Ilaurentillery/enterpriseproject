package com.animalfinder.dao;

import com.animalfinder.dto.BreedList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetBreeds {
	
	@GET("http://www.json-generator.com/api/json/get/cePuXvYdea?indent=2")
	Call<BreedList> getAllBreeds(@Query("CombinedName") String combinedName);
	
}

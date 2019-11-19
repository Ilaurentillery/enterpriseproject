package com.animalfinder.dao;

import com.animalfinder.dto.BreedList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetAnimals {
	
	@GET("http://NeedToMakeURLDAta")
	Call<BreedList> getAllAnimals(@Query("CombinedName") String combinedName);
	
}

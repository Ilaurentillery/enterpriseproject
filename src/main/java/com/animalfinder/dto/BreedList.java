package com.animalfinder.dto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BreedList {
	@SerializedName("animals")
	@Expose
	private List<BreedDTO> animals = null;
	
	public List<BreedDTO> getAnimals(){
		return animals;
		
	}

	public void setAnimals(List<BreedDTO> animals) {
		this.animals = animals;
	}
}

package com.animalfinder.dto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BreedList {
	@SerializedName("breeds")
	@Expose
	private List<BreedDTO> breeds = null;
	
	public List<BreedDTO> getAnimals(){
		return breeds;
		
	}

	public void setAnimals(List<BreedDTO> animals) {
		this.breeds = animals;
	}
}

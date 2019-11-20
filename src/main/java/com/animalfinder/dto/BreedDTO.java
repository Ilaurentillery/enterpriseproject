package com.animalfinder.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BreedDTO {

	@SerializedName("breedID")
	@Expose
	private int breedID;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("shelter")
	@Expose
	private String shelter;
	@SerializedName("size")
	@Expose
	private String size;

	@SerializedName("name")
	@Expose
	private String name;
	
	
	public int getBreedID() {
		return breedID;
	}
	public void setBreedID(int sbreedID) {
		this.breedID = sbreedID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getShelter() {
		return shelter;
	}
	public void setShelter(String shelter) {
		this.shelter = shelter;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return breedID + " " + gender + " " + shelter + " " + size + " " + name;
	}
	
	@Override 
	public boolean equals(Object obj) 
	{
		//assume they dont match
		boolean returnValue = false;
		if(obj instanceof BreedDTO) 
		{
			BreedDTO incomingBreed = (BreedDTO) obj;
			returnValue = incomingBreed.getBreedID() == getBreedID();
			
		}
		
		return returnValue;
	}
	
	
}

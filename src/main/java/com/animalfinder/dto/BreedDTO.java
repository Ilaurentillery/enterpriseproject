package com.animalfinder.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.bytebuddy.implementation.ToStringMethod;

public class BreedDTO {

	@SerializedName("breedID")
	@Expose
	private int breedID;
	@SerializedName("size")
	@Expose
	private String size;
	@SerializedName("age")
	@Expose
	private int age;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("shelter")
	@Expose
	private String shelter;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return breedID + " "  + " "  + age + " " + size + " " + gender + " " + shelter + " " + name;
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

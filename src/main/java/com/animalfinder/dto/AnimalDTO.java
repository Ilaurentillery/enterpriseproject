package com.animalfinder.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AnimalDTO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int breedID;
	
	private String gender;
	
	private String shelter;
	
	private String size;
	
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
	

}

package com.animalfinder.dto;

public class AnimalDTO {

	private int guid;
	private String breed;
	private String species;
	private String gender;
	private String shelter;
	private String name;
	private String genus;
	public int getGuid() {
		return guid;
	}
	public void setGuid(int guid) {
		this.guid = guid;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
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
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	
	@Override
	public String toString() {
		return guid + " " + breed + " " + species + " " + gender + " " + shelter + " "  + name + " " + genus;
	}
	
	
	
}

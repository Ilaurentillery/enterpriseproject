package com.animalfinder.dto;

public class BreedDTO {

	private int BreedID;
	private String latitude;
	private String longitude;
	private String gender;
	private String shelter;
	private String name;
	
	public int getBreedID() {
		return BreedID;
	}
	public void setBreedID(int sbreedID) {
		this.BreedID = sbreedID;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
	
	@Override
	public String toString() {
		return BreedID + " " + latitude + " " + longitude + " " + gender + " " + shelter + " " + name;
	}
	
	
	
}

package com.animalfinder.dto;

public class BreedDTO {

	private int BreedID;
	private double latitude;
	private double longitude;
	private String gender;
	private String shelter;
	private String name;
	
	public int getBreedID() {
		return BreedID;
	}
	public void setBreedID(int sbreedID) {
		this.BreedID = sbreedID;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
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

package com.animalfinder.dto;

public class BreedDTO {

	private int BreedID;
	private String latitude;
	private String longitude;
	
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
	
}

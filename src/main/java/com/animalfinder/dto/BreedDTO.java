package com.animalfinder.dto;

public class BreedDTO {

	private int BreedId;
	private String latitude;
	private String longitude;
	
	public int getBreedId() {
		return BreedId;
	}
	public void setBreedId(int sbreedId) {
		this.BreedId = sbreedId;
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

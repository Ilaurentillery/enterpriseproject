package com.animalfinder.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Breeds")
public class AnimalDTO {

	@Id
	@Column(name = "BreedID")
	private int breedID;
	@Column(name = "gender")
	private String gender;
	@Column(name = "shelter")
	private String shelter;
	@Column(name = "size")
	private String size;
	@Column(name = "name")
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

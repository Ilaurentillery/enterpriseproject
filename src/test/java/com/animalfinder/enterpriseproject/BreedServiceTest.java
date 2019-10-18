package com.animalfinder.enterpriseproject;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.service.IBreedService;

@RunWith(SpringRunner.class)
@SpringBootTest()

public class BreedServiceTest {

	
	@Autowired
	IBreedService breedService;
	List<AnimalDTO> animal;
	
	//added an "o" to fetchBreed_ValidateNoResultsForJunkData()
	@Test
	public void fetchBreed_ValidateNoResultsForJunkData() {
		givenUserISLoggedInToAnimalFinder();
		whenTheUserSearchesForJunk();	
		thenAnimalFinderReturnsNoResults();
		
		
	}
	//changed naming convention of this method
	private void givenUserIsLoggedIntoAnimalFinder() {
		
		
	}

	private void whenTheUserSearchesForJunk() {
		animal = breedService.fetchAnimals("corgie");
		
	}

	private void thenAnimalFinderReturnsNoResults() {
	   assertEquals("number of plants returned", 1, animal.size());
		
	}
	
	
	
}

package com.animalfinder.enterpriseproject;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.animalfinder.dto.BreedDTO;
import com.animalfinder.service.IBreedService;

@RunWith(SpringRunner.class)
@SpringBootTest()

public class BreedServiceTest {

	
	@Autowired
	IBreedService breedService;
	List<BreedDTO> animal;
	
	
	@Test
	public void fetchBreed_validateNoRsultsForJunkData() throws Exception {
		givenUserISLoggedInToAnimalFinder();
		whenTheUserSearchesFrJunk();	
		thenAnimalFinderReturnsNoResults();
		
		
	}

	private void givenUserISLoggedInToAnimalFinder() {
		
		
	}

	private void whenTheUserSearchesFrJunk() throws Exception {
		animal = breedService.fetchAnimals("placeholder");
		
	}

	private void thenAnimalFinderReturnsNoResults() {
	   assertEquals("number of plants returned", 1, animal.size());
		
	}
	
	
	
}

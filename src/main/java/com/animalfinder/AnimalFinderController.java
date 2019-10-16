package com.animalfinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.animalfinder.dto.BreedDTO;
import com.animalfinder.service.IBreedService;

@Controller
public class AnimalFinderController {

	
	@Autowired
	private IBreedService breedServiceStub;
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	@RequestMapping(value ="/start", method = RequestMethod.GET)
	public String fetch() {
		BreedDTO breedDTO = breedServiceStub.fetchByID(43);
		return "start";
	}
	
	@RequestMapping("/animalUpload")
	public String animalUpload() 
	{
		return "animalUpload";
	}
	
	@RequestMapping("/error")
	public String error() {
		
		return "start";
	}
	
	
}

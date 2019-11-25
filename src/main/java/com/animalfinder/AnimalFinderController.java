package com.animalfinder;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;
import com.animalfinder.service.IBreedService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class AnimalFinderController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private IBreedService breedService;

	@RequestMapping(value="/savebreed")
	public String saveBreed(AnimalDTO animalDTO) {
		animalDTO.setBreedID(13);
		animalDTO.setGender("Male");
		animalDTO.setName("Charles");
		animalDTO.setShelter("Cinci Shelter");
		animalDTO.setSize("Small");
		
		try {
			breedService.save(animalDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("unable to save animal", e);
			e.printStackTrace();
			return "error";
		}
		return "start";
		
	}
	
	@RequestMapping("/start")
	public String start(Model model) {
		log.info("user has entered the /start endpoint");
		model.addAttribute("breedDTO", new BreedDTO());
		return "start";
	}
	
	
	
	@RequestMapping("/searchAnimal")
	public ModelAndView searchAnimal(@RequestParam(value="searchTerm", required = false, defaultValue ="") String searchTerm) 
	{
		log.debug("enetering search animals");
		ModelAndView modelAndView = new ModelAndView();
		java.util.List<BreedDTO> animals = new ArrayList<BreedDTO>();
		 try {
			animals = breedService.fetchBreed(searchTerm);
			modelAndView.setViewName("animalResults");
			if(animals.size() == 0) {
				log.warn("array size is 0 for searched animal", searchTerm);
			}
		} catch (Exception e) {
			log.error("error occured in search animal endpoint", e);
			e.printStackTrace();
			modelAndView.setViewName("error"); 
		}
		 modelAndView.addObject("animals", animals);
		 log.debug("exiting searched animals");
		return modelAndView;
	}
	
	
	@RequestMapping("/animalUpload")
	public String animalUplaod(){
		return "animalUpload";
	}
	
	
	
	
	
	
}

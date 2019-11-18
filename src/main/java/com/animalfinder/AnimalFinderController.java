package com.animalfinder;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.animalfinder.dto.AnimalDTO;
import com.animalfinder.dto.BreedDTO;
import com.animalfinder.service.IBreedService;

@Controller
public class AnimalFinderController {

	
	@Autowired
	private IBreedService breedService;

	@RequestMapping(value="/savebreed")
	public String saveBreed(BreedDTO breedDTO) {
		breedDTO.setBreedID(13);
		return "start";
		
	}
	
	@RequestMapping("/start")
	public String start(Model model) {
		model.addAttribute("breedDTO", new BreedDTO());
		return "start";
	}
	
	
	@RequestMapping(value ="/start", method = RequestMethod.GET, params = {"loyaltySilverBreed"})
	public String read(Model model) {
		BreedDTO breedDTO = breedService.fetchByID(43);
		model.addAttribute("BreedDTO", breedDTO);
		return "start";
	}
	
	@RequestMapping(value ="/start", method = RequestMethod.GET, params = {"loyaltyBreed"})
	public ModelAndView loyaltyBreed(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		BreedDTO breedDTO = breedService.fetchByID(43);
		modelAndView.addObject("breedDTO", breedDTO);
		
		
		return modelAndView;
	}
	
	@RequestMapping("/searchAnimal")
	public String searchAnimal(@RequestParam(value="searchTerm", required = false, defaultValue ="") String searchTerm) 
	{
		String enhancedTerm = searchTerm + "";
		 java.util.List<AnimalDTO> fetchAnimals = breedService.fetchAnimals(searchTerm);
		return "start";
	}
	
	
	@RequestMapping("/animalUpload")
	public String animalUpload(){
		return "animalUpload";
	}
	
	
	
	
	
	
}

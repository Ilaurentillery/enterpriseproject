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
	
	
	
	@RequestMapping("/searchAnimal")
	public String searchAnimal(@RequestParam(value="searchTerm", required = false, defaultValue ="") String searchTerm) 
	{
		String enhancedTerm = searchTerm + "";
		 try {
			java.util.List<BreedDTO> fetchAnimals = breedService.fetchAnimals(searchTerm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "start";
	}
	
	
	@RequestMapping("/animalUpload")
	public String animalUplaod(){
		return "animalUpload";
	}
	
	
	
	
	
	
}

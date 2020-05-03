package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;
    private final GreetingService greetingService;
    
    public PetController(PetService dogPetService, GreetingService i18nEnglishGreetingService) {
    	this.petService = dogPetService;
    	this.greetingService = i18nEnglishGreetingService;
	}
    
	/*
	 * public PetController(GreetingService greetingService, PetService
	 * dogPetService ) { this.petService = dogPetService; this.greetingService =
	 * greetingService; }
	 */

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

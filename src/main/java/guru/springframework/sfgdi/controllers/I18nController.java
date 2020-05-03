package guru.springframework.sfgdi.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by jt on 12/27/19.
 */
@Controller
public class I18nController {

	@Resource( name = "i18nEnglishGreetingService")
    private final GreetingService i18NSpanishService;
   
    public I18nController(	GreetingService i18NSpanishService) {
        this.i18NSpanishService = i18NSpanishService;
    }

    public String sayHello(){
        return i18NSpanishService.sayGreeting();
    }
}

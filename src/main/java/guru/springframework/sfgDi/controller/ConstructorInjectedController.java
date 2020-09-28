package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by abdelkader on 09/24/2020.
 */

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }

}

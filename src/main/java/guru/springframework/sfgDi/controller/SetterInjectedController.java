package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by abdelkader on 09/24/2020.
 */

@Controller
public class SetterInjectedController {



    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}

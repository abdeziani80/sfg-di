package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;

/**
 * Created by abdelkader on 09/24/2020.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}

package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by abdelkader on 09/23/2020.
 */

public class PropertyInjectedController {

        public GreetingService greetingService;

        public String getGreeting(){

            return greetingService.sayGreeting();
        }




}

package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by abdelkader on 09/23/2020.
 */
@Controller
public class PropertyInjectedController {

        @Qualifier("propertyInjectionGreetingService")
        @Autowired
        public GreetingService greetingService;

        public String getGreeting(){

            return greetingService.sayGreeting();
        }




}

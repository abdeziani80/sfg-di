package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by abdelkader on 09/23/2020.
 */
@Controller
public class MyController{

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

                 //System.out.println("Hello World !!!!");

                 return greetingService.sayGreeting();
}




}







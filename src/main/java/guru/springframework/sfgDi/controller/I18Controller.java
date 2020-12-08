package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by abdelkader on 12/08/2020.
 */

@Controller
public class I18Controller {

    private final GreetingService greetingService;

    public I18Controller(@Qualifier("i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}

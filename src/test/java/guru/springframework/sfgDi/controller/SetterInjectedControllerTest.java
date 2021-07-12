package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.ConstructorInjectionGreetingService;
import guru.springframework.sfgDi.services.SetterInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by abdelkader on 09/24/2020.
 */
class SetterInjectedControllerTest {

   SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterInjectionGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }


}
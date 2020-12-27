package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.ConstructorInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by abdelkader on 09/24/2020.
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new ConstructorInjectionGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}
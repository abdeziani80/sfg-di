package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by abdelkader on 09/23/2020.
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImp();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}
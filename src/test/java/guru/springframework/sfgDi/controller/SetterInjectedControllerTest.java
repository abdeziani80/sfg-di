package guru.springframework.sfgDi.controller;

import guru.springframework.sfgDi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by abdelkader on 09/24/2020.
 */
class SetterInjectedControllerTest {

   SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}
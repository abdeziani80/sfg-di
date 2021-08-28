package guru.springframework.sfgDi.services;



/**
 * Created by abdelkader on 10/01/2020.
 */

public class SetterInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}

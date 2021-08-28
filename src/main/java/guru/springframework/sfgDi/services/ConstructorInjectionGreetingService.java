package guru.springframework.sfgDi.services;



/**
 * Created by abdelkader on 09/23/2020.
 */


public class ConstructorInjectionGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

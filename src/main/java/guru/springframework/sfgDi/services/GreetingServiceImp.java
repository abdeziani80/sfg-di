package guru.springframework.sfgDi.services;

/**
 * Created by abdelkader on 09/23/2020.
 */
public class GreetingServiceImp implements GreetingService{

    @Override
    public String sayGreeting() {
        return "hello World";
    }
}

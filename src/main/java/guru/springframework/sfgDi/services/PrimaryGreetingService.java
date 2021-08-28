package guru.springframework.sfgDi.services;



/**
 * Created by abdelkader on 11/09/2020.
 */

public class PrimaryGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello World! - From The PRIMARY Bean";
    }
}

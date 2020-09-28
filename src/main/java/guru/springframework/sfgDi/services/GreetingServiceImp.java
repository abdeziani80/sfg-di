package guru.springframework.sfgDi.services;

import org.springframework.stereotype.Service;

/**
 * Created by abdelkader on 09/23/2020.
 */

@Service
public class GreetingServiceImp implements GreetingService{

    @Override
    public String sayGreeting() {
        return "hello World";
    }
}

package guru.springframework.sfgDi.services;

import org.springframework.stereotype.Service;

/**
 * Created by abdelkader on 10/01/2020.
 */
@Service
public class SetterInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}

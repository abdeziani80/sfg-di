package guru.springframework.sfgDi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by abdelkader on 11/09/2020.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello World! - From The PRIMARY Bean";
    }
}

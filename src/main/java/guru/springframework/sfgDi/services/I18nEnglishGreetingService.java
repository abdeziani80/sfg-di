package guru.springframework.sfgDi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by abdelkader on 12/08/2020.
 */
@Profile("EN")
@Service("i18Service")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

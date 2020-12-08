package guru.springframework.sfgDi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by abdelkader on 12/08/2020.
 */
@Profile("ES")
@Service("i18Service")
public class I18nSpanishGreetingService  implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

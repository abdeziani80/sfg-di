package guru.springframework.sfgDi.services;



/**
 * Created by abdelkader on 12/08/2020.
 */

public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}

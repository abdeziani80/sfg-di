package guru.springframework.sfgDi.services;



/**
 * Created by abdelkader on 12/08/2020.
 */

public class I18nSpanishGreetingService  implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

package guru.springframework.sfgDi.config;


import guru.springframework.sfgDi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {


    @Bean
    @Primary
    PrimaryGreetingService  primaryGreetingService(){

        return new PrimaryGreetingService();
    }


    @Bean
    ConstructorInjectionGreetingService constructorInjectionGreetingService(){

        return new ConstructorInjectionGreetingService();
    }

    @Bean
    PropertyInjectionGreetingService propertyInjectionGreetingService(){
        return new PropertyInjectionGreetingService();
    }

    @Bean
    SetterInjectionGreetingService setterInjectionGreetingService(){
        return new SetterInjectionGreetingService();
    }

    @Bean
    @Profile("EN")
    I18nEnglishGreetingService i18Service(){
        return new I18nEnglishGreetingService();
    }

    @Bean("i18Service")
    @Profile({"ES", "default"})
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }












}

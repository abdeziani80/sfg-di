package guru.springframework.sfgDi;

import guru.springframework.sfgDi.controller.*;
//import org.omg.PortableServer.ServantRetentionPolicy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sfgDi", "com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)

	{
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);


		I18Controller i18Controller = (I18Controller)context.getBean("i18Controller");

		System.out.println(i18Controller.sayHello());

		MyController myController =(MyController)context.getBean("myController");

		//String greeting = myController.sayHello();
		System.out.println("-------- Primary Bean");

		System.out.println(myController.sayHello());

		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor");


		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());


		PetController petController = context.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


	}

}

package edu.raj.dev.beans;

import org.springframework.stereotype.Component;

//Annotation bean registration
//Registering a bean to application context(Spring container or IOC container)
// Uisng @Component annotation
@Component
public class MyBean1 {

	public void printHello() {
		System.out.println("Inside MyBean 1:" + " Hello");
	}

}

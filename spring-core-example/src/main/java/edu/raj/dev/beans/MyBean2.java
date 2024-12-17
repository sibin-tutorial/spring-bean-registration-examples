package edu.raj.dev.beans;

import org.springframework.stereotype.Service;

//Annotation bean registration
//Registerin a bean using @Service annotation
@Service
public class MyBean2 {

	public void printGreetings() {
		System.out.println("Inside MyBean2: Greetings...");
	}
}

package edu.raj.dev.beans;

import org.springframework.stereotype.Controller;

//Regestering a bean using @Controller annotation

@Controller
public class MyBean4 {

	public void printHey() {
		System.out.println("Inside MyBean4: Hey");
	}
}

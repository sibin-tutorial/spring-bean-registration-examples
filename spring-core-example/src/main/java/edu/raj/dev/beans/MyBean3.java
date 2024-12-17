package edu.raj.dev.beans;

import org.springframework.stereotype.Repository;

//annotation based configuration
//registering a bean to spring container using @RePOSITORY ANNOTATION
@Repository
public class MyBean3 {

	public void printHi() {
		System.out.println("Inside MyBean3: Hi");
	}
}

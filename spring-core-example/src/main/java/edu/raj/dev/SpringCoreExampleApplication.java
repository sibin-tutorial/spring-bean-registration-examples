package edu.raj.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.raj.dev.beans.MyBean1;
import edu.raj.dev.beans.MyBean2;
import edu.raj.dev.beans.MyBean3;
import edu.raj.dev.beans.MyBean4;
import edu.raj.dev.beans.MyBean5;

@SpringBootApplication
public class SpringCoreExampleApplication implements CommandLineRunner {

	// Dependency injection
	// 1. Field injection
	@Autowired
	private MyBean1 myBean1;

	@Autowired
	private MyBean2 myBean2;

	@Autowired
	private MyBean3 myBean3;

	@Autowired
	private MyBean4 myBean4;

	@Autowired
	private MyBean5 myBean5;

	// 2. Concrtuctor Injection
	// 3. Setter Injection

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		myBean1.printHello();
		myBean2.printGreetings();
		myBean3.printHi();
		myBean4.printHey();
		myBean5.printHola();
	}

}

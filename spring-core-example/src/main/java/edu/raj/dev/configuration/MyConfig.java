package edu.raj.dev.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.raj.dev.beans.MyBean5;

//Java based configuration to register a bean
@Configuration
public class MyConfig {

	@Bean
	public MyBean5 myBean5() {
		return new MyBean5();
	}
}

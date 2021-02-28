package com.jpa.test.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MassageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
 
		System.out.println("welcome to spring boot ");
		
	}

}

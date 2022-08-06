package edu.example.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "edu.example")
public class SampleApiApplication {

	public static void main (String [] args) {
		SpringApplication.run(SampleApiApplication.class);
	}

}

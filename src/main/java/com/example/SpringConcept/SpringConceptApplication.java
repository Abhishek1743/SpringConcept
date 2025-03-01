package com.example.SpringConcept;

import com.example.SpringConcept.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		System.out.println("Welcome to Spring Concept Demo");
		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}

}

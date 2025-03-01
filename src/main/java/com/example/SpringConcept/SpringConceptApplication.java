package com.example.SpringConcept;

import com.example.SpringConcept.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot. SpringApplication;
import org.springframework.boot.autoconfigure. SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept");
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");

	}

}

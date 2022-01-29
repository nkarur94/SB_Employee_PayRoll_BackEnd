package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PayRollEmpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PayRollEmpApplication.class, args);
		log.info("nithun has started coding",context.getEnvironment().getProperty("environment"));
	}

}

package com.demo.logbackDemo;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@CommonsLog
public class LogbackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbackDemoApplication.class, args);
		log.error("logback demo");
	}

}

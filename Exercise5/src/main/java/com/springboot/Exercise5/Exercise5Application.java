package com.springboot.Exercise5;

import com.springboot.Exercise5.question3.User;
import com.springboot.Exercise5.question4.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.springboot.Exercise5.question1_2"})
@EnableJpaRepositories(basePackages = {"com.springboot.Exercise5.question7"})
public class Exercise5Application {

	@Bean
	public User user(){
		return new User("ritesh893","225415");
	}

	@Bean
	public Database db(){
		return new Database();
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercise5Application.class, args);
	}

}

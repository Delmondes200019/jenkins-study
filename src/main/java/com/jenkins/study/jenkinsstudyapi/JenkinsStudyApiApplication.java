package com.jenkins.study.jenkinsstudyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsStudyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsStudyApiApplication.class, args);
	}
}

@RestController
class HelloWorldRestController {
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public String helloWorld() {
		return "Hello World From a Spring Boot Application";
	}
}

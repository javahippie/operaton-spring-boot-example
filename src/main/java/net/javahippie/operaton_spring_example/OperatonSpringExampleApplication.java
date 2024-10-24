package net.javahippie.operaton_spring_example;

import org.operaton.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("twitter-qa")
public class OperatonSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperatonSpringExampleApplication.class, args);
	}

}

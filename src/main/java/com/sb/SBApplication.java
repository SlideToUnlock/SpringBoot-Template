package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sb.*", "com.sb.config"})
public class SBApplication {
	public static void main(String[] args) {
		SpringApplication.run(SBApplication.class, args);
	}
}

package com.fetchrewards.emailchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
public class EmailChecker {
	
public static void main(String[] args) {
	    SpringApplication.run(EmailChecker.class,args);
}

}

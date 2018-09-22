package com.atishay.eurekaserver.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
public class Application extends SpringBootServletInitializer{
	




	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	 
	
}


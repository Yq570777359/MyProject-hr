package com.hr.hr_eurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HrEurekaserver02Application {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaserver02Application.class, args);
	}

}

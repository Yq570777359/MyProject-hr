package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hr.dao")
public class HrProviderApplication02 {
	public static void main(String[] args) {
		SpringApplication.run(HrProviderApplication02.class, args);
	}

}

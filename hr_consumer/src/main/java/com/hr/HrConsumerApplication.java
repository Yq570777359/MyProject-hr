package com.hr;

import com.hr.ConfigBeans.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@EnableFeignClients
@RibbonClient(name = "provider",configuration = RibbonRule.class)
@SpringBootApplication
public class HrConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(HrConsumerApplication.class, args);
	}

}

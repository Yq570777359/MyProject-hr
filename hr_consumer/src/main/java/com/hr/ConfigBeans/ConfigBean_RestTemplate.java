package com.hr.ConfigBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean_RestTemplate {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

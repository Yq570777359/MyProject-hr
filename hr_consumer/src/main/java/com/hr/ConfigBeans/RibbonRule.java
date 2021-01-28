package com.hr.ConfigBeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRule {
    @Bean
    public IRule setRibbonRules(){
        return new RoundRobinRule();
    }
}

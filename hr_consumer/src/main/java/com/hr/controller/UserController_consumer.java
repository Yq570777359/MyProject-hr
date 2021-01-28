package com.hr.controller;


import com.hr.entity.Emp;
import com.hr.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController_consumer {
    @Autowired
    private RestTemplate restTemplate;
    private final String REST_URI_PRIFIX = "http://localhost:9988";
    @RequestMapping("/login")
    public Userinfo login(String name, String pwd){
        System.out.println("consumer-login");
        Map map = new HashMap();
        map.put("name",name);
        map.put("pwd",pwd);
        Userinfo data = restTemplate.postForObject(REST_URI_PRIFIX+"/user/login",map,Userinfo.class);
        System.out.println(data);
        return data;
    }
    @RequestMapping("/empLogin")
    public Emp empLogin(String name, String pwd){
        Map map = new HashMap();
        map.put("name",name);
        map.put("pwd",pwd);
        Emp data = restTemplate.postForObject(REST_URI_PRIFIX+"/user/empLogin",map,Emp.class);
        return data;
    }

}

package com.hr.controller;


import com.hr.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.hr.service.DeptService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DeptService service;

    @RequestMapping("/show")
    public List show(){
        List list = service.show();
        System.out.println("list="+list);
        return list;
    }

}

package com.hr.controller;

import com.hr.entity.Emp;
import com.hr.entity.Userinfo;
import com.hr.service.UserinfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("/user")
public class UserController {
    @Resource
    UserinfoService userinfoService;
    @RequestMapping("/login")
    public Userinfo login(@RequestBody Map<String,String> user){
            System.out.println(user.get("name"));
            Map map = new HashMap();
            map.put("name",user.get("name"));
            map.put("pwd",user.get("pwd"));
            Userinfo data = userinfoService.loginUser(map);
            return data;
    }
    @RequestMapping("/empLogin")
    public Emp empLogin( @RequestBody Map<String,String> user){
        Map map = new HashMap();
        map.put("name",user.get("name"));
        map.put("pwd",user.get("pwd"));
        Emp data = userinfoService.loginEmp(map);
        return data;
    }

}

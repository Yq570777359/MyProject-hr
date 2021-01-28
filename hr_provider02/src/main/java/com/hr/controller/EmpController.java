package com.hr.controller;

import com.hr.entity.Emp;
import com.hr.service.EmpService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Resource
    EmpService empService;

    @RequestMapping("/count")
    public List count(){
        List list = empService.showAll();
        return list;
    }

    @RequestMapping("/pager")
    public List pager(@RequestBody Map<String,Integer> data){
        Map map =  new HashMap();
        map.put("start",data.get("start"));
        map.put("pageSize",data.get("pageSize"));
        List list = empService.pager(map);
        return list;
    }
    @RequestMapping("/{id}/del")
    public void del(@PathVariable int id){
        empService.del(id);
    }
    @RequestMapping("/loadDept")
    public List loadDept(){
        List allDept = empService.loadDept();
        System.out.println("no String");
        return allDept;
    }
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void add(@RequestBody Emp data){
        empService.add(data);
    }
    @RequestMapping("/loadRole")
    public List loadRole() {
        List allRole = empService.loadRole();
        System.out.println("aad");
        return allRole;
    }
    @RequestMapping("/update")
            public void update(@RequestBody Emp data){
        empService.update(data);
    }

}

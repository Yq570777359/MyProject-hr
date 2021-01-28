package com.hr.controller;

import com.hr.entity.Dept;
import com.hr.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.bouncycastle.tsp.TSPUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    DeptService deptService;
    @RequestMapping("/add")
    public void add(@RequestBody Dept data){
        System.out.println(data);
        deptService.add(data);
    }

    @RequestMapping("/{id}/del")
    public void del(@PathVariable int id){
        deptService.del(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Dept data){
        deptService.update(data);
    }
 /*   @RequestMapping(value = "check",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String check(String name){
        Dept data = deptService.check(name);
        if(data==null){
            return "yes";
        }else{
            return "no";
        }

    }*/
    @RequestMapping("/search")
    public List search(String name){
        List data = deptService.check(name);
        return data;
    }




    @RequestMapping("/{id}/load")
    public Dept load(@PathVariable int id){
        Dept data = deptService.load(id);
        return data;
    }
    @RequestMapping("/delAll")
    public void delAll(int[] ids){
        for(int deptId:ids){
            deptService.del(deptId);
        }
    }
    @RequestMapping("/show")
    public List show(){
        System.out.println("provider01");
        List list = deptService.show();
        return list;
    }

    @RequestMapping("/test")
    //@HystrixCommand(fallbackMethod = "introduce")
    public Dept test(){
        System.out.println("provider test");
        throw new RuntimeException();
    }


    @RequestMapping("/pager")
    public List pager(@RequestBody Map<String,Integer> data){
        Map map = new HashMap();
        map.put("pageSize",data.get("pageSize"));
        map.put("start",data.get("start"));
        List list = deptService.pager(map);
        return list;
    }
}

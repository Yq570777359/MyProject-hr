package com.hr.controller;



import com.hr.entity.Dept;
import com.hr.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept")
public class DeptController_consumer {

    @Autowired
    DeptService deptService;
    @RequestMapping("/add")
    public void add(@RequestBody Dept data){
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

    @RequestMapping("/search")
    public List search(String name){
        List data = deptService.seach(name);
        return data;
    }


    @RequestMapping("/show")
    public List show(){
        List list = deptService.show();
        return list;
    }

    @RequestMapping("/{id}/load")
    public Dept load(@PathVariable int id){
        Dept data = deptService.load(id);
        return data;
    }
    @RequestMapping("/delAll")
    public void delAll(int[] ids){
        deptService.delAll(ids);
    }

    @RequestMapping("/pager")
    public List pager(int pageNo,int pageSize){
        Map map = new HashMap();
        map.put("pageSize",pageSize);
        map.put("start",(pageNo-1)*pageSize);
        List data = deptService.pager(map);
        return data;
    }
    @RequestMapping("/test")
    public Dept test(){
        Dept data = deptService.test();
        return data;
    }
}

package com.hr.service;
import com.hr.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
@Component
@FeignClient(name = "provider",fallbackFactory = FallBackUtil.class)
public interface DeptService {
    @RequestMapping(value="/dept/show")
    List show();
    @RequestMapping("/dept/add")
    void add(Dept data);
    @RequestMapping("/dept/del")
    void del( int id);
    @RequestMapping("/dept/update")
    void update(Dept data);
    @RequestMapping("/dept/seach")
    List seach(String name);
    @RequestMapping("/dept/load")
    Dept load(int id);
    @RequestMapping("/dept/delAll")
    void delAll(int[] ides);
    @RequestMapping("/dept/pager")
    List pager(Map map);
    @RequestMapping(value="/dept/test")
    Dept test();
}

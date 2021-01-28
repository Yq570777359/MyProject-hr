package com.hr.service;


import com.hr.dao.DeptDao;
import com.hr.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DeptService {
    @Resource
    DeptDao deptDao;
    public List show(){
    List list = deptDao.show();
    return list;
    }
    public void add(Dept data){
        deptDao.insert(data);
    }

    public void del(int id){
        deptDao.deleteByPrimaryKey(id);
    }
     public Dept load(int id ){
        Dept data =  deptDao.selectByPrimaryKey(id);
        return data;
     }
     public void update(Dept data){
        deptDao.updateByPrimaryKey(data);
     }
     public List check(String name){
        List data = deptDao.check(name);
        return data;
     }
     public List pager(Map map){
        List data = deptDao.pager(map);
        return data;
     }
}

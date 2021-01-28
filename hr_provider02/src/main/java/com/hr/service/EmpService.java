package com.hr.service;




import com.hr.dao.EmpDao;
import com.hr.entity.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EmpService {
    @Resource
    EmpDao empDao;
    public List showAll(){
        return empDao.showAll();
    }
    public List loadDept(){
        return empDao.loadDept();
    }
    public List loadRole(){
        return empDao.loadRole();
    }
    public void del(int id){
        empDao.deleteByPrimaryKey(id);
    }
    public void add(Emp data){
        empDao.insert(data);
    }
    public Emp loadEmp(int id){
        return empDao.selectByPrimaryKey(id);
    }
    public void update(Emp data){
        empDao.updateByPrimaryKey(data);
    }
    public Emp check(String empno){
        Emp data = empDao.check(empno);
        return data;
    }
    public List pager(Map map){
        List list = empDao.pager(map);
        return list;
    }
}

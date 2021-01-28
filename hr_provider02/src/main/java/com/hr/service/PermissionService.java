package com.hr.service;

import com.hr.dao.RoleinfoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PermissionService {
    @Resource
    RoleinfoDao roleinfoDao;
    public List loadRole(){
        List list =roleinfoDao.allRoles();
        return list;
    }
    public List loadRight(){
        List list = roleinfoDao.allRights();
        return list;
    }
    public Object load(int id){
        Object data = roleinfoDao.selectByPrimaryKey(id);
        return data;
    }
    public void insert(Map map){
        roleinfoDao.insert(map);
    }
    public void delete(int id){
        roleinfoDao.deleteByPrimaryKey(id);
    }
}

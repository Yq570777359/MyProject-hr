package com.hr.service;

import com.hr.dao.UserinfoDao;
import com.hr.entity.Emp;
import com.hr.entity.Userinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

@Service
public class UserinfoService {
    @Resource
    UserinfoDao userinfoDao;

    public Emp loginEmp(Map map) {
        Emp data = userinfoDao.loginEmp(map);
        return data;
    }
    public Userinfo loginUser(Map map){
        Userinfo data = userinfoDao.loginUser(map);
        return data;
    }
    public Set loadRight(int id){
        Set rights = userinfoDao.loadRight(id);
        return rights;
    }
}

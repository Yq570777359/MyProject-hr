package com.hr.dao;



import com.hr.entity.Emp;
import com.hr.entity.Userinfo;

import java.util.Map;
import java.util.Set;

public interface UserinfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

    Userinfo loginUser(Map map);

    Emp loginEmp(Map map);

    Set loadRight(int id);
}
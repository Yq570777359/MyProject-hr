package com.hr.dao;


import com.hr.entity.Emp;

import java.util.List;
import java.util.Map;

public interface EmpDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List showAll();

    List loadDept();

    List loadRole();

    Emp check(String empno);

    List pager(Map map);
}
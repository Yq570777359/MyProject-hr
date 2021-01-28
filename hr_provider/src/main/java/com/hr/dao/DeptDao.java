package com.hr.dao;



import com.hr.entity.Dept;

import java.util.List;
import java.util.Map;

public interface DeptDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List show();

    List check(String name);

    List pager(Map map);
}
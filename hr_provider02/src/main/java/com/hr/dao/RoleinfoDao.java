package com.hr.dao;



import com.hr.entity.Roleinfo;

import java.util.List;
import java.util.Map;

public interface RoleinfoDao {
    void deleteByPrimaryKey(Integer id);

    void insert(Map map);

    int insertSelective(Roleinfo record);

    Roleinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roleinfo record);

    int updateByPrimaryKey(Roleinfo record);

    List allRoles();

    List allRights();

}
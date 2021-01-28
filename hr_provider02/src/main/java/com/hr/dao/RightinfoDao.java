package com.hr.dao;


import com.hr.entity.Rightinfo;

public interface RightinfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Rightinfo record);

    int insertSelective(Rightinfo record);

    Rightinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rightinfo record);

    int updateByPrimaryKey(Rightinfo record);
}
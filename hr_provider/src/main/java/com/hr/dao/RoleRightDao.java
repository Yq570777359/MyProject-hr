package com.hr.dao;

import com.hr.entity.RoleRight;

public interface RoleRightDao {
    int insert(RoleRight record);

    int insertSelective(RoleRight record);
}
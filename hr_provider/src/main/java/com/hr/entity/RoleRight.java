package com.hr.entity;

import java.io.Serializable;


/**
 * role_right
 * @author 
 */

public class RoleRight implements Serializable {
    private Integer roleId;

    private Integer rightId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }
}
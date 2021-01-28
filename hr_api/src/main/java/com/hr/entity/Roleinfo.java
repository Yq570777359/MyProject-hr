package com.hr.entity;

import java.io.Serializable;
import java.util.Set;


/**
 * roleinfo
 * @author 
 */

public class Roleinfo implements Serializable {
    private Integer id;

    private String name;

    private String operation;

    private Set rights;

    public Set getRights() {
        return rights;
    }

    public void setRights(Set rights) {
        this.rights = rights;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
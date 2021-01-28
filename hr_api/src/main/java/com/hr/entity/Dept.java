package com.hr.entity;

import java.io.Serializable;

/**
 * dept
 * @author 
 */

public class Dept implements Serializable {
    private Integer id;

    private String name;

    private String manager;

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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
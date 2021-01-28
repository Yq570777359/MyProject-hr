package com.hr.entity;

import java.io.Serializable;

/**
 * emp
 * @author 
 */

public class Emp implements Serializable {
    private Integer id;

    private String empno;

    private String name;

    private String sex;

    private Integer age;

    private Integer salary;

    private String tel;

    private String photo;

    private String intime;

    private Integer deptId;

    private String pwd;

    private int role;

    private com.hr.entity.Dept dept;

    private Roleinfo roleinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public com.hr.entity.Dept getDept() {
        return dept;
    }

    public void setDept(com.hr.entity.Dept dept) {
        this.dept = dept;
    }

    public Roleinfo getRoleinfo() {
        return roleinfo;
    }

    public void setRoleinfo(Roleinfo roleinfo) {
        this.roleinfo = roleinfo;
    }
}
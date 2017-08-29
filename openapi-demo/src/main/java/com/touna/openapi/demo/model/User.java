/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo.model;

import java.io.Serializable;

/**
 * 用户
 * 
 * @author hezhuguo
 * @version $Id: User.java, v 0.1 2016年6月7日 下午1:58:03 hezhuguo Exp $
 */
public class User implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = -5961343113629291873L;

    /**
     * 用户id
     */
    private String            id;

    /**
     * 用户名称
     */
    private String            name;

    /**
     * 性别
     */
    private Sex               sex;

    /**
     * 年龄    
     */
    private int               age;

    /**
     * email
     */
    private String            email;

    /**
     * 地址
     */
    private Address           address;

    /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>sex</tt>.
     * 
     * @return property value of sex
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Setter method for property <tt>sex</tt>.
     * 
     * @param sex value to be assigned to property sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * Getter method for property <tt>age</tt>.
     * 
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     * 
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>email</tt>.
     * 
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     * 
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>address</tt>.
     * 
     * @return property value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter method for property <tt>address</tt>.
     * 
     * @param address value to be assigned to property address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", email="
               + email + ", address=" + address + "]";
    }

}

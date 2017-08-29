/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo.model;

import java.io.Serializable;

/**
 * 地址
 * 
 * @author hezhuguo
 * @version $Id: Address.java, v 0.1 2016年6月7日 下午2:13:24 hezhuguo Exp $
 */
public class Address implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = -8041786312093541190L;

    private String            city;

    private String            street;

    private String            zipCode;

    /**
     * Getter method for property <tt>city</tt>.
     * 
     * @return property value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for property <tt>city</tt>.
     * 
     * @param city value to be assigned to property city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter method for property <tt>street</tt>.
     * 
     * @return property value of street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Setter method for property <tt>street</tt>.
     * 
     * @param street value to be assigned to property street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter method for property <tt>zipCode</tt>.
     * 
     * @return property value of zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter method for property <tt>zipCode</tt>.
     * 
     * @param zipCode value to be assigned to property zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Address [city=" + city + ", street=" + street + ", zipCode=" + zipCode + "]";
    }

}

/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo.service.impl;

import com.touna.openapi.demo.exception.UserNotFindException;
import com.touna.openapi.demo.model.Address;
import com.touna.openapi.demo.model.Sex;
import com.touna.openapi.demo.model.User;
import com.touna.openapi.demo.service.UserService;

/**
 * 用户服务
 * 
 * @author zhuguo.hezg
 * @version $Id: UserServiceImpl.java, v 0.1 2017年8月25日 下午12:43:06 zhuguo.hezg Exp $
 */
public class UserServiceImpl implements UserService {

    /** 
     * @see com.touna.openapi.demo.service.UserService#addUser(com.touna.openapi.demo.model.User)
     */
    @Override
    public void addUser(User user) {
        System.out.println("add User:" + user);
    }

    /** 
     * @see com.touna.openapi.demo.service.UserService#getUser(java.lang.String)
     */
    @Override
    public User getUser(String id) {
        if (id.equals("1688")) {
            throw new UserNotFindException("user not find");
        }
        User user = new User();
        user.setId(id);
        user.setName("leo he");
        user.setAge(30);
        user.setEmail("openapi@touna.cn");
        user.setSex(Sex.FEMALE);
        Address address = new Address();
        address.setCity("深圳");
        address.setStreet("香梅路");
        user.setAddress(address);
        return user;
    }

}

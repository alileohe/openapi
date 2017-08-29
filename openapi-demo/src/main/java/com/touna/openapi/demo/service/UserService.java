/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo.service;

import com.touna.openapi.demo.model.User;

/**
 * 用户服务
 * 
 * @author hezhuguo
 * @version $Id: UserService.java, v 0.1 2016年6月7日 下午2:46:23 hezhuguo Exp $
 */
public interface UserService {

    /**
     * 添加用户
     * 
     * @param user
     */
    void addUser(User user);
    
    /**
     * 根据id获取用户
     * 
     * @param id
     * @return
     */
    User getUser(String id);
}

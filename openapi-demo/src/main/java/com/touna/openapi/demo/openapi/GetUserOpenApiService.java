/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo.openapi;

import org.springframework.beans.factory.annotation.Autowired;

import com.touna.openapi.demo.exception.UserNotFindException;
import com.touna.openapi.demo.model.User;
import com.touna.openapi.demo.service.UserService;
import com.touna.openapi.spi.OpenApiService;
import com.touna.openapi.spi.model.OpenApiRequest;
import com.touna.openapi.spi.model.OpenApiResponse;

/**
 * 获取用户信息开放接口
 * 
 * @author zhuguo.hezg
 * @version $Id: GetUserOpenApiService.java, v 0.1 2017年8月25日 下午12:37:26 zhuguo.hezg Exp $
 */
public class GetUserOpenApiService implements OpenApiService {

    @Autowired
    private UserService userService;

    /** 
     * @see com.touna.openapi.spi.OpenApiService#getOpenApiMethod()
     */
    @Override
    public String getOpenApiMethod() {
        return "touna.openapidemo.user.getUser";
    }

    /** 
     * @see com.touna.openapi.spi.OpenApiService#getOpenApiVersion()
     */
    @Override
    public String getOpenApiVersion() {
        return "1.0";
    }

    /** 
     * @see com.touna.openapi.spi.OpenApiService#doService(com.touna.openapi.spi.model.OpenApiRequest, com.touna.openapi.spi.model.OpenApiResponse)
     */
    @Override
    public void doService(OpenApiRequest request, OpenApiResponse response) {
        String userId = request.getParameter("userId");
        try {
            User user = userService.getUser(userId);
            response.setAttribute(user);
        } catch (UserNotFindException ex) {
            response.setCode("USER_NOT_FIND");
            response.setMsg("用户不存在");
        }
    }

}

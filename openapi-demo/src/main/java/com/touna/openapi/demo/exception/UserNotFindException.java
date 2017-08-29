/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo.exception;

/**
 *  用户不存在
 * 
 * @author zhuguo.hezg
 * @version $Id: UserNotFindException.java, v 0.1 2017年8月25日 上午9:52:19 zhuguo.hezg Exp $
 */
public class UserNotFindException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = 1L;

    public UserNotFindException() {

    }

    public UserNotFindException(String message) {
        super(message);
    }
}

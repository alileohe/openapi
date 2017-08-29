/**
 * Touna.com Inc.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.touna.openapi.demo;

import org.springframework.boot.SpringApplication;

/**
 * OpenApiDemoApp
 * 
 * @author zhuguo.hezg
 * @version $Id: OpenApiGatewayApp.java, v 0.1 2017年8月5日 下午1:10:43 zhuguo.hezg Exp $
 */
public class OpenApiDemoApp {

    private static volatile boolean running = true;

    public static void main(String[] args) {
        SpringApplication.run("classpath:/META-INF/application-context.xml", args);

        synchronized (OpenApiDemoApp.class) {
            while (running) {
                try {
                    OpenApiDemoApp.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }

}

package com.huihuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 *   routes:
 *     api-a:
 *       path: /member/**
 *       service-id: service-member
 *     api-b:
 *       path: /order/**
 *       service-id: service-order-feign
 *       这是一个网关，以上是它可以路由到的服务的配置。
 *       访问网关的时候加上path里面的地址就可以路由到该服务。
 *       比如输入http://localhost:8769/order/getUserList
 *       就可以访问到order的getUserList服务
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class AppZuul {

    public static void main(String[] args) {
        SpringApplication.run(AppZuul.class, args);
    }
}

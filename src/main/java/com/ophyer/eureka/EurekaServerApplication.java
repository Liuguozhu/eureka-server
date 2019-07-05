package com.ophyer.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LGZ
 * @package PACKAGE_NAME
 * @className com.ophyer.ZuulServerApplication
 * @description eurekaserver com.ophyer.ZuulServerApplication
 * @date 2019/7/3 14:40:57
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}


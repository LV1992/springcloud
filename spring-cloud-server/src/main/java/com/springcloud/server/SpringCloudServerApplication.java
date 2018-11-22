package com.springcloud.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** @see // https://blog.csdn.net/q15150676766/article/details/80931187
 * 在Dubbo中使用的ZooKeeper作为服务注册与发现的容器，在Springcloud中使用的是Eureka作为服务注册与发现的容器。
 *
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerApplication.class, args);
    }
}

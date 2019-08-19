package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient和@EnableDiscoveryClient相似点：Eureka都是在相同的classPath下
@SpringBootApplication
@EnableEurekaClient//表示其他服务发现组件也可以支持
//@EnableDiscoveryClient//表示Enable服务专属注解
public class SpringClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientApplication.class, args);
	}

}

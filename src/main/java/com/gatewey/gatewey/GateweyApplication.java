package com.gatewey.gatewey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class GateweyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateweyApplication.class, args);
	}

}

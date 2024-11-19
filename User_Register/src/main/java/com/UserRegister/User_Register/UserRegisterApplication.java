package com.UserRegister.User_Register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class UserRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegisterApplication.class, args);
	}

}

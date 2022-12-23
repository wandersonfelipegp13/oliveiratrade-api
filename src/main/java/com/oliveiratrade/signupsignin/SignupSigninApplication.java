package com.oliveiratrade.signupsignin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties()
public class SignupSigninApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupSigninApplication.class, args);
	}

}

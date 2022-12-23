package com.oliveiratrade.signupsignin;

import com.oliveiratrade.signupsignin.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class SignupSigninApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupSigninApplication.class, args);
	}

}

package com.seancmp.user.cmd.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.seancmp.user.configuration.AxonConfig;

@SpringBootApplication
@Import(AxonConfig.class)
public class UserCmdApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCmdApiApplication.class, args);
	}

}

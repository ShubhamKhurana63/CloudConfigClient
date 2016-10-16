package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.client")
@RestController
@RefreshScope
public class Application {

	@Value("${message}")
	private String message;

	@RequestMapping(value = "/checkclient")
	String hello() {
		return "hello" + message;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package com.iknowers.springboot.learning;

import javax.annotation.Resource;

import com.iknowers.springboot.learning.aop.MockService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Resource
	private MockService service;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class SpringdemoApplication {

	@RequestMapping("/")
	@ResponseBody
	public String greeting() {
		return "Hello World!";
	}

//	// 添加子路径
//	@ResponseBody
//	@RequestMapping("/hello")
//	public String hello() {
//		return "Hello World abc 123";
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
}

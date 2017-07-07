package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomalController {
	// 可变子路径，访问时http://127.0.0.1:8080/users/hello对应参数username的值就是hello
	// URL中的变量可以用{variableName}来表示，同时在方法的参数中加上
	// @PathVariable("variableName")，那么当请求被转发给该方法处理时，
	// 对应的URL中的变量会被自动赋值给被@PathVariable注解的参数
	@RequestMapping("/users/{username}")
	public String userProfile(@PathVariable("username") String username) {
		return String.format("user %s", username);
	}

	// 设置请求方式
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
		return "Login Get Page";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost() {
		return "Login Post Request";
	}

	@RequestMapping("/test")
	public String testParam(String name, String psw) {
		return name + " | " + psw;
	}
}

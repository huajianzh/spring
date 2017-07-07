package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	// 返回Html页面
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name); // 设置参数
		return "hello";
		// 返回hello表示寻找名字为hello的模板进行渲染
		// Thymeleaf模板引擎进行模板渲染需要引入spring-boot-starter-thymeleaf
		// 默认的模板文件夹src/main/resources/templates/目录下添加一个模板文件hello.html
	}

	@RequestMapping("/testLogin")
	public ModelAndView testModel(String name, String psw) {
		ModelAndView model = new ModelAndView("login");
		model.getModelMap().addAttribute("name", name);
		model.getModelMap().addAttribute("psw", psw);
		return model;
	}
	
	@RequestMapping("/testLogin1")
	public String testModel(ModelMap model,String name,String psw){
		model.addAttribute("name", name);
		model.addAttribute("psw", psw);
		return "login";
	}
}

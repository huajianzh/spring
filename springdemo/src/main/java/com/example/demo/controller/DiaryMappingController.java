package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.Diary;
import com.example.demo.mapper.DiaryMapper;

@RestController
public class DiaryMappingController {
	@Autowired
	DiaryMapper diaryMapper;
	
	@RequestMapping("/diary")
	public String getDiary(Integer id){
		Diary d = diaryMapper.getDiaryById(id);
		String json = JSON.toJSONString(d);
		return json;
	}
}

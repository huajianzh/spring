package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.Diary;
import com.example.demo.bean.User;
import com.example.demo.mapper.DiaryMapper;

@RestController
public class DiaryMappingController {
	@Autowired
	DiaryMapper diaryMapper;

	@RequestMapping("/diary")
	public String getDiary(Integer id) {
		Diary d = diaryMapper.getDiaryById(id);
		String json = JSON.toJSONString(d);
		return json;
	}
	
	@RequestMapping("/diary2")
	public String getDiary2(Integer id) {
		Diary d = diaryMapper.getDiaryById2(id);
		String json = JSON.toJSONString(d);
		return json;
	}

	@RequestMapping("/all_diary")
	public String getAllDiary() {
		List<Diary> l = diaryMapper.getAllDiary();
		if (null != l) {
			String json = JSON.toJSONString(l);
			return json;
		}
		return "";
	}

	@RequestMapping("/add_diary")
	public String addDiary(String title, String content, int userId) {
		Diary d = new Diary(title,content,new Date(System.currentTimeMillis()),userId);
		int row = diaryMapper.addDiary(d);
		if (row > 0) {
			return "success";
		} else {
			return "fail";
		}
	}
	
}

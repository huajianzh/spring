package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.Diary;

@Mapper
public interface DiaryMapper {

	@Select("select * from diary where _id = #{id}")
	public Diary getDiaryById(@Param("id")Integer id);
}

package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.Tag;

@Mapper
public interface TagMapper {

	/**
	 * 根据文章id获取标签列表 
	 * @param diaryId
	 * @return
	 */
	public List<Tag> getTagsByDiaryId(@Param("d_id") int diaryId);
}

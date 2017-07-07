package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.Diary;

@Mapper
public interface DiaryMapper {

	/**
	 * 获取文章内容
	 * 
	 * @param id
	 *            文章id
	 * @return
	 */
	public Diary getDiaryById(@Param("id") Integer id);
	
	/**
	 * 获取文章内容
	 * 
	 * @param id
	 *            文章id
	 * @return
	 */
	public Diary getDiaryById2(@Param("id") Integer id);

	/**
	 * 获取所有文章
	 * 
	 * @return
	 */
	public List<Diary> getAllDiary();

	/**
	 * 添加文章
	 */
	public Integer addDiary(Diary d);

	/**
	 * 更新文章
	 * 
	 * @param d
	 */
	public Integer updateDiary(Diary d);

	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	public Integer deleteDiary(@Param("id") Integer id);

}

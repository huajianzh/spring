package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.User;

@Mapper
public interface UserMapper {

	/**
	 * 根据id获取用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(@Param("id") int id);
}

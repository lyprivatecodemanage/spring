package com.spring.dao;

import org.apache.ibatis.annotations.Mapper;

import com.spring.bean.A;

@Mapper
public interface AtabMapper {
	A select();
}

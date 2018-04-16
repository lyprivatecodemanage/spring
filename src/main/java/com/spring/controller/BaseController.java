package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.bean.A;
import com.spring.dao.AtabMapper;

@Controller
@RequestMapping("/base")
public class BaseController {
	@Autowired
	private AtabMapper atabMapper;
	@ResponseBody
	@RequestMapping(value="/data")
	public  Map<String,Object> getData(String jsonString,HttpServletRequest request){
		System.out.println("===========>");
		Map<String,Object> result = new HashMap<String,Object>();
		A data = atabMapper.select();
		System.out.println(data.toString());
		result.put("data", data.toString());
		return result;
	}
}

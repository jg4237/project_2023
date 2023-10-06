package com.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	private int count;
	
	public UsrHomeController() {
		count = 0;
	}
	
	@ResponseBody
	@RequestMapping("/usr/home/getCount")
	public int getCount() {
		return count;
	}
	
	@ResponseBody
	@RequestMapping("/usr/home/setCount")
	public String setCount(int count) {
		this.count = count;
		return "count 값이 " +this.count +"으로 초기화 되었습니다.";
	}
}

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
	@RequestMapping("/usr/home/main")
	public String showMain() {
		return "안녕하세요.";
	}
	
	@ResponseBody
	@RequestMapping("/usr/home/main2")
	public int showMain2() {
		return 0;
	}
	
	@ResponseBody
	@RequestMapping("/usr/home/main3")
	public int showMain3() {
		return count++;
	}
	
	@ResponseBody
	@RequestMapping("/usr/home/main4")
	public String showMain4() {
		count = 0;
		return "count 값이 0으로 초기화 되었습니다.";
	}
}

package com.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	@ResponseBody
	@RequestMapping("/usr/home/main")
	public String showMain() {
		return "Spring project";
	}
}

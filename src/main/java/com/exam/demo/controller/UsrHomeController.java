package com.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Controller
public class UsrHomeController {

	@RequestMapping("/usr/home/test1")
	@ResponseBody
	public String getString() {
		return "Hello";
	}
	
	@RequestMapping("/usr/home/test2")
	@ResponseBody
	public int getInt() {
		return 10;
	}

	@RequestMapping("/usr/home/test3")
	@ResponseBody
	public float getFloat() {
		return 10.4f;
	}
	
	@RequestMapping("/usr/home/test4")
	@ResponseBody
	public double getDouble() {
		return 10.3;
	}
	
	@RequestMapping("/usr/home/test5")
	@ResponseBody
	public boolean getBoolean() {
		return true;
	}
	
	@RequestMapping("/usr/home/test6")
	@ResponseBody
	public Character getCharachter() {
		return 'a';
	}
	
	@RequestMapping("/usr/home/test7")
	@ResponseBody
	public Map<String, Object> getMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("나이", 22);
		return map;
	}
	
	@RequestMapping("/usr/home/test8")
	@ResponseBody
	public List<String> getList() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		return list;
	}
	
	@RequestMapping("/usr/home/test9")
	@ResponseBody
	public Article getArticle() {
		Article article = new Article();
		return article;
	}
	
	@RequestMapping("/usr/home/test10")
	@ResponseBody
	public List<Article> getArticles() {
		Article article1 = new Article(1, "제목1");
		Article article2 = new Article(2, "제목2");
		
		List<Article> list = new ArrayList<>();
		list.add(article1);
		list.add(article2);

		return list;
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Article {
	private int id;
	private String title;

}

package com.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.demo.vo.Article;

@Controller
public class UsrArticleController {
	private List<Article> articles;
	private int articleLastId;
	
	public UsrArticleController() {
		articles = new ArrayList<>();
		articleLastId = 0;
	}
	
	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		int id = articleLastId + 1;
		Article article = new Article(id, title, body);
		
		articles.add(article);
		articleLastId = id;
		
		return article;
	}

	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articles;
	}
}

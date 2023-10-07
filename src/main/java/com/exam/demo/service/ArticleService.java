package com.exam.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.demo.repository.ArticleRepository;
import com.exam.demo.vo.Article;

@Service
public class ArticleService {
	private ArticleRepository articleRepository;
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
		articleRepository.makeTestData();
	}
	
	public Article writeArticle(String title, String body) {
		
		return articleRepository.writeArticle(title, body);
	}
	
	public void modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
	}

	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);	
	}

	public Article getArticle(int id) {

		return articleRepository.getArticle(id);
	}
	
	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}
	
}

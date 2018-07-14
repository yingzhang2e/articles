package com.lexsci.articles.articles.service;

import com.lexsci.articles.articles.dao.IArticleDAO;
import com.lexsci.articles.articles.entity.Article;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements IArticleService {
    @Autowired
    private IArticleDAO articleDAO;

    @Override
    public List<Article> getAllArticles() {
        return articleDAO.getAllArticles();
    }

    @Override
    public Article getArticleById(int articleId) {
        return articleDAO.getArticleById(articleId);
    }

    @Override
    public synchronized boolean createArticle(Article article){
        if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
            return false;
        } else {
            articleDAO.createArticle(article);
            return true;
        }
    }

    @Override
    public void updateArticle(Article article) {
        articleDAO.updateArticle(article);
    }

    @Override
    public void deleteArticle(int articleId) {
        articleDAO.deleteArticle(articleId);
    }
}

package com.lexsci.articles.articles;

import com.lexsci.articles.articles.entity.Article;
import com.lexsci.articles.articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class ArticlesApplication implements CommandLineRunner {
	@Autowired
	private ArticleService articleService;

	public static void main(String[] args) {
		SpringApplication.run(ArticlesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		//SpringApplication.run(ArticlesApplication.class, args);
		System.out.println("******start############");
		try {
			articleService.createArticle(new Article("Angular 2 - CLI","https://www.tutorialspoint.com/angular2/angular2_cli.htm","Computer Science"));
			articleService.createArticle(new Article("Java Tutorial","https://www.tutorialspoint.com/java/","Computer Science"));
			articleService.createArticle(new Article("Newton's Second Law","https://isaacphysics.org/concepts/cp_newtonii","Physics"));
			articleService.createArticle(new Article("Newton's Laws - HyperPhysics Concepts","http://hyperphysics.phy-astr.gsu.edu/hbase/Newt.html","Physics"));

			/*articleService.createArticle(new Article("Angular 2 - CLI","xyx","Computer Science"));
			articleService.createArticle(new Article("Java Tutorial","aaa","Computer Science"));
			articleService.createArticle(new Article("Newton's Second Law","bbbb","Physics"));
			articleService.createArticle(new Article("Newton's Laws - HyperPhysics Concepts","cccc","Physics"));*/
		}catch (Exception e){
			System.out.println("################" + e.getMessage());
		}

		List<Article> articleList = articleService.getAllArticles();
		for (Article a: articleList) {
			System.out.println("Article[ID:" + a.getArticleId() + ", Title:" + a.getTitle() + " url:" + a.getUrl() + ", Category:" + a.getCategory() + "]");
		}

	}
}

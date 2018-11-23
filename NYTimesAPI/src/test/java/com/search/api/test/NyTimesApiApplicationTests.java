package com.search.api.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.search.api.controller.NyTimesApiHandler;
import com.search.api.payload.Article;
import com.search.api.payload.DetailArticle;

import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NyTimesApiApplicationTests {

    @Autowired
    NyTimesApiHandler handler;

    @Test
    public void testlistArticles() {
        String section = "all-sections";
        String period = "1";
        Mono<Article> articles = handler.getAllArticles(section, period);
        
        org.springframework.util.Assert.notNull(articles);
    }
    
    @Test
    public void testDetailArticle() {
    	String section = "all-sections";
    	String period = "1";
    	String assetId = "100000006067838";
    	Mono<DetailArticle> articleDetail = handler.getArticleDetailById(section, period, assetId);
    	
    	articleDetail
    	.map(detail -> detail.getResults())
    	.map(results -> {
    		
    		results.stream()
    		.map(result -> result.getAsset_id())
    		.forEach(System.out::println);
    		return 0;
    	});
    	
    	org.springframework.util.Assert.notNull(articleDetail);
    }
    

}

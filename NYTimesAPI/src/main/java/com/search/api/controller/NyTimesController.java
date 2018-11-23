package com.search.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.api.payload.Article;
import com.search.api.payload.DetailArticle;

import reactor.core.publisher.Mono;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
@RestController
@RequestMapping("/api/v1/")
public class NyTimesController {
	
	private static final Logger logger = LoggerFactory.getLogger(NyTimesController.class);

    @Autowired
    NyTimesApiHandler clientHandler;

    @GetMapping("/list/mostviewed/{section}/{period}")
    public Mono<Article> getAllArticles(@PathVariable(value = "section") String section, @PathVariable(value = "period") String period) {
    	logger.info("getAllArticles - {} - {}",section,period);
        return clientHandler.getAllArticles(section, period);
    }
    
    @GetMapping("/list/mostviewed/{section}/{period}/{asset_id}")
    public Mono<DetailArticle> getArticleDetailById(@PathVariable(value = "section") String section, @PathVariable(value = "period") String period, @PathVariable(value = "asset_id") String assetId) {
    	logger.info("getArticleDetailById - {} - {} - {}",section,period,assetId);
    	return clientHandler.getArticleDetailById(section, period, assetId);
    }
}

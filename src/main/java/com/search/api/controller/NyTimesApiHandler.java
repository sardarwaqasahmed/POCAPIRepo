package com.search.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.api.model.Result;
import com.search.api.payload.Article;
import com.search.api.payload.DetailArticle;
import com.search.api.service.NyTimesClient;

import reactor.core.publisher.Mono;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
@Service
public class NyTimesApiHandler {
	
	@Autowired
    private NyTimesClient nyTimesClient;

	public Mono<Article> getAllArticles(String section, String period) {
		
		return this.nyTimesClient.getAllArticles(section, period);
    }

    public Mono<DetailArticle> getArticleDetailById(String section, String period, String assetId) {
    	
    	return this.nyTimesClient.getMasterDetailArticles(section, period)
    	.map(detailArticle -> detailArticle.getResults())
    	.map(results -> results
    			.stream()
    			.filter(predicate -> predicate.getAsset_id().equals(assetId))
    			.findFirst()
    			.get())
    	.flatMap(this::getDetailArticle);
    }

	private Mono<DetailArticle> getDetailArticle(Result result) {
		DetailArticle detailArticle = new DetailArticle("OK","Copyright (c) 2018 The New York Times Company.  All Rights Reserved.",1);
		detailArticle.getResults().add(result);
		return Mono.just(detailArticle);
	}
}

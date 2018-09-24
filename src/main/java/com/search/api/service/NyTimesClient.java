package com.search.api.service;
/*
@ Author	: Sardar Waqas Ahmed
@ Date 		: 23 Sep 2018
@ Version	: 1.0
@ Company	: NONE
@
*/

import org.springframework.stereotype.Service;

import com.search.api.payload.Article;
import com.search.api.payload.MasterArticle;

import reactor.core.publisher.Mono;

@Service
public interface NyTimesClient {
	
	public Mono<Article> getAllArticles(String section, String period);
	public Mono<MasterArticle> getMasterDetailArticles(String section, String period);
}

package com.search.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.search.api.config.AppProperties;
import com.search.api.payload.Article;
import com.search.api.payload.MasterArticle;
import com.search.api.service.NyTimesClient;

import reactor.core.publisher.Mono;

/*
@ Author	: Sardar Waqas Ahmed
@ Date 		: 23 Sep 2018
@ Version	: 1.0
@ Company	: NONE
@
*/
@Service
public class NyTimesClientImpl implements NyTimesClient {	

	private static final String MIME_TYPE = "application/json";
	private final String uri = "/mostviewed/{section}/{period}.json?apikey={key}";
	private final WebClient webClient;

	@Autowired
	AppProperties prop;

	@Autowired
	public NyTimesClientImpl(AppProperties appProperties) {
		this.webClient = WebClient
								.builder()
								.baseUrl(appProperties.getAPI_BASE_URL())
								.defaultHeader(HttpHeaders.CONTENT_TYPE, MIME_TYPE)
								.build();
	}
	    
	@Override
	public Mono<Article> getAllArticles(String section, String period) {

		return webClient.get()
				.uri(uri, section, period, prop.getAPI_KEY())
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.retrieve()
				.bodyToMono(Article.class);
	}

	@Override
    public Mono<MasterArticle> getMasterDetailArticles(String section, String period) {
        return webClient
        				.get()
        				.uri(uri, section, period, prop.getAPI_KEY())
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .retrieve()
                        .bodyToMono(MasterArticle.class);
    }

}

package com.search.api;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.search.api.config.AppProperties;
import com.search.api.model.Result;
import com.search.api.payload.DetailArticle;
import com.search.api.payload.MasterArticle;

import reactor.core.publisher.Mono;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
@Service
public class NyTimesApiClient {

    private static final String MIME_TYPE = "application/json";

    private static final Logger logger = LoggerFactory.getLogger(NyTimesApiClient.class);

    private final WebClient webClient;

    @Autowired
    public NyTimesApiClient(AppProperties appProperties) {
        this.webClient = WebClient.builder().baseUrl(appProperties.getAPI_BASE_URL())
                                  .defaultHeader(HttpHeaders.CONTENT_TYPE, MIME_TYPE).build();
    }

    public Mono<MasterArticle> getAllArticles(String section, String period, String apiKey) {
        return webClient
        				.get()
        				.uri("/mostviewed/{section}/{period}.json?apikey={key}", section, period, apiKey)
                        .accept(MediaType.APPLICATION_JSON_UTF8).exchange()
                        .flatMap(clientResponse -> clientResponse.bodyToMono(MasterArticle.class));
    }

    public Mono<DetailArticle> getArticleDetailById(String section, String period,String assetId, String apiKey) {
    	//return 
    			
    			this.getAllArticles(section, period, apiKey)
    			.flatMap(mArticle -> mArticle.getResults().stream()
																	.filter(result -> assetId.equals(result.getAsset_id())).forEach(System.out::println))
    			;
//    																	.findAny()
//    																	.get());

    			return null;														
    }
}

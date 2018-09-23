package com.search.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.api.NyTimesApiClient;
import com.search.api.config.AppProperties;
import com.search.api.payload.DetailArticle;
import com.search.api.payload.MasterArticle;

import reactor.core.publisher.Mono;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
@RestController
@RequestMapping("/api/v1/")
public class NyTimesController {

    @Autowired
    NyTimesApiClient client;

    @Autowired
    AppProperties prop;

    @GetMapping("/list/mostviewed/{section}/{period}")
    public Mono<MasterArticle> getAllArticles(@PathVariable(value = "section") String section, @PathVariable(value = "period") String period) {
        return client.getAllArticles(section, period, prop.getAPI_KEY());
    }
    
    @GetMapping("/list/mostviewed/{section}/{period}/{asset_id}")
    public Mono<DetailArticle> getArticleDetailById(@PathVariable(value = "section") String section, @PathVariable(value = "period") String period, @PathVariable(value = "asset_id") String assetId) {
        return client.getArticleDetailById(section, period, assetId, prop.getAPI_KEY());
    }
}

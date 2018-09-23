package com.search.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Waqas.Ahmed01
 * @Date Sep 23, 2018
 *
 */
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private String name;
    private String description;
    private String API_KEY;
    private String API_BASE_URL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public void setAPI_KEY(String aPI_KEY) {
        API_KEY = aPI_KEY;
    }

    public String getAPI_BASE_URL() {
        return API_BASE_URL;
    }

    public void setAPI_BASE_URL(String aPI_BASE_URL) {
        API_BASE_URL = aPI_BASE_URL;
    }

}

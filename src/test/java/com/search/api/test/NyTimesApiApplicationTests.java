package com.search.api.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.search.api.NyTimesApiClient;
import com.search.api.config.AppProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NyTimesApiApplicationTests {

    @Autowired
    NyTimesApiClient client;

    @Autowired
    AppProperties prop;

    //private String apiKey = prop.getAPI_KEY();

    @Test
    public void testlistArticles() {
        String section = "all-sections";
        String period = "1";
        client.getAllArticles(section, period, "43d7501194af46b398d45507b19d0dfa").subscribe(System.out::println);
    }

}

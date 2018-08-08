package com.rgfp.scrumdeveloper.testDoubles.service;

import com.rgfp.scrumdeveloper.testDoubles.service.domain.QuoteMapper;
import org.springframework.web.client.RestTemplate;

public class QuoteClient {

    private static final String URL = "http://gturnquist-quoters.cfapps.io/api/random";

    public String getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, QuoteMapper.class).toString();
    }
}
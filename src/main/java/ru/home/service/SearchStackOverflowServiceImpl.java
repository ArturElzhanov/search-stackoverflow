package ru.home.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import ru.home.domain.SearchBuilder;
import ru.home.domain.StackOverflowPosts;
import ru.home.strategy.PostNameStrategy;

import java.io.IOException;

@Service
public class SearchStackOverflowServiceImpl implements SearchStackOverflowService {

    @Override
    public StackOverflowPosts getPosts(SearchBuilder requestBuilder) {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(new PostNameStrategy());
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                HttpClientBuilder.create().build());
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        String  post = restTemplate.getForObject(requestBuilder.build(), String.class);

        StackOverflowPosts stackOverflowPosts = new StackOverflowPosts();
        try {
            stackOverflowPosts = objectMapper.readValue(post,StackOverflowPosts.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }

        return stackOverflowPosts;
    }

    @Override
    public boolean checkRequestData(String searchInTitleText) {
        return !StringUtils.isEmpty(searchInTitleText) &&
                searchInTitleText.matches("^[a-zA-Z0-9]+$");
    }
}

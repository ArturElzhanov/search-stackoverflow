package ru.home.service;

import ru.home.domain.StackOverflowPosts;

public interface SearchStackOverflowService {
    StackOverflowPosts getPosts(String searchInTitleText);
}

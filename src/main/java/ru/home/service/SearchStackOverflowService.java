package ru.home.service;

import ru.home.domain.SearchBuilder;
import ru.home.domain.StackOverflowPosts;

/**
 * Service to search StackOverflow site
 */
public interface SearchStackOverflowService {
    /**
     * Search posts from StackOverflow api site by text in title
     *
     * @param  searchBuilder
     * @return StackOverflowPosts
     */
    StackOverflowPosts getPosts(SearchBuilder searchBuilder);

    /**
     * Check text by user on not null ang english symbols
     *
     * @param searchInTitleText text in title
     * @return check result
     */
    boolean checkRequestData(String searchInTitleText);
}

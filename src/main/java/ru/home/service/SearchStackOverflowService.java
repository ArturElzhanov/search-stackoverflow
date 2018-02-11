package ru.home.service;

import ru.home.domain.StackOverflowPosts;

/**
 * Service to search StackOverflow site
 */
public interface SearchStackOverflowService {

    /**
     * Search posts from StackOverflow api site by text in title
     *
     * @param searchInTitleText text in title
     * @return StackOverflowPosts
     */
    StackOverflowPosts getPosts(String searchInTitleText);
}

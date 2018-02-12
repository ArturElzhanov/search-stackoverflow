package ru.home.domain;

import org.springframework.util.StringUtils;

/**
 * StackOverflow search request model
 */
public class SearchBuilder {

    private static final String DEFAULT_SORT = "activity";
    private static final String DEFAULT_TITLE = "java";
    private static final String ORDER_AND_SORT = "order=desc&sort=";
    private static final String PREFIX = "http://api.stackexchange.com/2.2/search?";
    private static final String SUFFIX = "site=stackoverflow";

    private String title;
    private String sortBy;

    public SearchBuilder(String title, String sortBy) {
        this.title = title;
        this.sortBy = sortBy;
    }

    public String getTitle() {
        return title;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String build () {
        StringBuilder stringBuilder = new StringBuilder(PREFIX);

        if (!StringUtils.isEmpty(sortBy)) {
            stringBuilder.append(ORDER_AND_SORT + sortBy + "&");
        } else {
            stringBuilder.append(ORDER_AND_SORT + DEFAULT_SORT + "&");
        }

        if (!StringUtils.isEmpty(title)) {
            stringBuilder.append("intitle=" + title + "&");
        } else {
            stringBuilder.append("intitle=" + DEFAULT_TITLE + "&");
        }

        stringBuilder.append(SUFFIX);

        return stringBuilder.toString();
    }
}

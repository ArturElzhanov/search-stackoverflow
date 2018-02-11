package ru.home.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Model for StackOverflowPosts response
 */
public class StackOverflowPosts implements Serializable {

    private List<Post> items;
    private boolean hasMore;
    private int quotaMax;
    private int quotaRemaining;

    public StackOverflowPosts() {
    }

    public StackOverflowPosts(List<Post> items, boolean hasMore, int quotaMax, int quotaRemaining) {
        this.items = items;
        this.hasMore = hasMore;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
    }

    public List<Post> getItems() {
        return items;
    }

    public void setItems(List<Post> items) {
        this.items = items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(int quotaMax) {
        this.quotaMax = quotaMax;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }
}

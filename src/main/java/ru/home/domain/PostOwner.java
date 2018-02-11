package ru.home.domain;

import java.io.Serializable;

public class PostOwner implements Serializable {
    private long reputation;
    private long userId;
    private String userType;
    private String profileImage;
    private String displayName;
    private String link;
    private int acceptRate;

    public PostOwner() {
    }

    public PostOwner(long reputation, long userId, String userType, String profileImage, String displayName, String link, int acceptRate) {
        this.reputation = reputation;
        this.userId = userId;
        this.userType = userType;
        this.profileImage = profileImage;
        this.displayName = displayName;
        this.link = link;
        this.acceptRate = acceptRate;
    }

    public long getReputation() {
        return reputation;
    }

    public void setReputation(long reputation) {
        this.reputation = reputation;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(int acceptRate) {
        this.acceptRate = acceptRate;
    }
}

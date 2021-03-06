package ru.home.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * StackOverflow post model
 */
public class Post implements Serializable {
    private List<String> tags;
    private PostOwner owner;
    private boolean isAnswered;
    private int viewCount;
    private Date closedDate;
    private int bountyAmount;
    private Date bountyClosesDate;
    private long acceptedAnswerId;
    private int answerCount;
    private Date communityOwnedDate;
    private int score;
    private Date lastActivityDate;
    private Date creationDate;
    private Date lastEditDate;
    private long questionId;
    private String link;
    private String closedReason;
    private String title;
    private Date protectedDate;
    private Date lockedDate;


    public Post() {
    }

    public Post(List<String> tags,
                PostOwner owner,
                boolean isAnswered,
                int viewCount,
                long closedDate,
                int bountyAmount,
                long bountyClosesDate,
                long acceptedAnswerId,
                int answerCount,
                long communityOwnedDate,
                int score,
                long lastActivityDate,
                long creationDate,
                long lastEditDate,
                long questionId,
                String link,
                String closedReason,
                String title,
                long protectedDate,
                long lockedDate) {
        this.tags = tags;
        this.owner = owner;
        this.isAnswered = isAnswered;
        this.viewCount = viewCount;
        this.closedDate = parseDate(closedDate);
        this.bountyAmount = bountyAmount;
        this.bountyClosesDate = parseDate(bountyClosesDate);
        this.acceptedAnswerId = acceptedAnswerId;
        this.answerCount = answerCount;
        this.communityOwnedDate = parseDate(communityOwnedDate);
        this.score = score;
        this.lastActivityDate = parseDate(lastActivityDate);
        this.creationDate = parseDate(creationDate);
        this.lastEditDate = parseDate(lastEditDate);
        this.questionId = questionId;
        this.link = link;
        this.closedReason = closedReason;
        this.title = title;
        this.protectedDate = parseDate(protectedDate);
        this.lockedDate = parseDate(lockedDate);
    }


    private Date parseDate(Long dateInSec) {
        return new Date(dateInSec * 1000L); // т.к. ждёт в ms
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public PostOwner getOwner() {
        return owner;
    }

    public void setOwner(PostOwner owner) {
        this.owner = owner;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(long closedDate) {
        this.closedDate = parseDate(closedDate);
    }

    public int getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(int bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    public Date getBountyClosesDate() {
        return bountyClosesDate;
    }

    public void setBountyClosesDate(long bountyClosesDate) {
        this.bountyClosesDate = parseDate(bountyClosesDate);
    }

    public long getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(long acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public Date getCommunityOwnedDate() {
        return communityOwnedDate;
    }

    public void setCommunityOwnedDate(long communityOwnedDate) {
        this.communityOwnedDate = parseDate(communityOwnedDate);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(long lastActivityDate) {
        this.lastActivityDate = parseDate(lastActivityDate);
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = parseDate(creationDate);
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(long lastEditDate) {
        this.lastEditDate = parseDate(lastEditDate);
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getClosedReason() {
        return closedReason;
    }

    public void setClosedReason(String closedReason) {
        this.closedReason = closedReason;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getProtectedDate() {
        return protectedDate;
    }

    public void setProtectedDate(long protectedDate) {
        this.protectedDate = parseDate(protectedDate);
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }
}

package com.rumofuture.nemo.model.domain;

import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2017/4/18.
 */

public class Follow extends IdEntity {

    private User author;
    private User follower;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public Follow() {

    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}

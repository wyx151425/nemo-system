package com.rumofuture.nemo.model.domain;

import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2017/4/18.
 */

public class Favorite extends IdEntity {

    private Book book;
    private User favor;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public Favorite() {

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getFavor() {
        return favor;
    }

    public void setFavor(User favor) {
        this.favor = favor;
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

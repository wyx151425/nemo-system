package com.rumofuture.nemo.model.domain;

import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2017/8/31.
 */

public class Album extends IdEntity {

    private String coverUrl;  // 专辑封面图片id

    private String style;  // 专辑的风格
    private String note;  // 专辑的注释

    private Integer number;  // 专辑顺序编号
    private Integer bookTotal;  // 专辑漫画册总数

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public Album() {

    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(Integer bookTotal) {
        this.bookTotal = bookTotal;
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

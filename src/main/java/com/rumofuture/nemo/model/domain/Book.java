package com.rumofuture.nemo.model.domain;

import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2016/12/24.
 */

public class Book extends IdEntity {

    private User author;  // 所属漫画作者

    private String name;  // 名称
    private String style;  // 风格
    private String introduction;  // 简介
    private String url;  // 网页地址

    private Integer pageTotal;  // 漫画册漫画分页数
    private Long favorTotal;  // 收藏此漫画的用户数

    private String coverUrl;  // 漫画册封面

    private Boolean approve;
    private Boolean show;
    private Boolean share;
    private Boolean own;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public Book() {

    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Long getFavorTotal() {
        return favorTotal;
    }

    public void setFavorTotal(Long favorTotal) {
        this.favorTotal = favorTotal;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Boolean getApprove() {
        return approve;
    }

    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getShare() {
        return share;
    }

    public void setShare(Boolean share) {
        this.share = share;
    }

    public Boolean getOwn() {
        return own;
    }

    public void setOwn(Boolean own) {
        this.own = own;
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

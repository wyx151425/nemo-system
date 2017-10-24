package com.rumofuture.nemo.model.domain;

import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2016/12/24.
 */

public class User extends IdEntity {

    private String name;  // 姓名
    private String mobilePhoneNumber;  // 手机号
    private String password;  // 密码

    private String email;  // 邮箱
    private String motto;  // 座右铭
    private String profile;  // 简介
    private String profession;  // 职业
    private String location;  // 所在地

    private String gender;  // 性别

    private Integer age;  // 年龄
    private Long followTotal;  // 关注作家数
    private Long followerTotal;  // 粉丝数
    private Long favoriteTotal; // 收藏漫画册数
    private Integer bookTotal;  // 漫画册数量

    private String avatarUrl;  // 头像
    private String portraitUrl;  // 个人肖像

    private Boolean authorize;

    private LocalDateTime birthday;  // 生日
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getFollowTotal() {
        return followTotal;
    }

    public void setFollowTotal(Long followTotal) {
        this.followTotal = followTotal;
    }

    public Long getFollowerTotal() {
        return followerTotal;
    }

    public void setFollowerTotal(Long followerTotal) {
        this.followerTotal = followerTotal;
    }

    public Long getFavoriteTotal() {
        return favoriteTotal;
    }

    public void setFavoriteTotal(Long favoriteTotal) {
        this.favoriteTotal = favoriteTotal;
    }

    public Integer getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(Integer bookTotal) {
        this.bookTotal = bookTotal;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public Boolean getAuthorize() {
        return authorize;
    }

    public void setAuthorize(Boolean authorize) {
        this.authorize = authorize;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
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

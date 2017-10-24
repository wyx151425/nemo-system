package com.rumofuture.nemo.model.dto.request.user;

import com.rumofuture.nemo.model.domain.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserSignUpDTO implements UserDTO {

    @NotBlank
    @Length(min = 2)
    private String name;

    @NotBlank
    @Length(min = 11, max = 11)
    @Pattern(regexp = "^(1[0-9])\\d{9}$")
    private String mobilePhoneNumber;

    @NotBlank
    @Length(min = 6, max = 255)
    private String password;

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

    @Override
    public User convertToUser() {
        User user = new User();
        user.setName(name);
        user.setMobilePhoneNumber(mobilePhoneNumber);
        user.setPassword(password);
        user.setEmail("");
        user.setAvatarUrl("");
        user.setPortraitUrl("");
        user.setMotto("");
        user.setEmail("");
        user.setLocation("");
        user.setProfession("");
        user.setProfile("");
        user.setGender("保密");
        user.setAge(0);
        user.setBookTotal(0);
        user.setFollowTotal(0L);
        user.setFollowerTotal(0L);
        user.setFavoriteTotal(0L);
        user.setBirthday(LocalDateTime.now().withNano(0));
        user.setCreateTime(LocalDateTime.now().withNano(0));
        user.setUpdateTime(LocalDateTime.now().withNano(0));
        return user;
    }
}

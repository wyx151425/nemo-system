package com.rumofuture.nemo.model.dto.request.user;

import com.rumofuture.nemo.model.domain.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserLoginDTO implements UserDTO {

    @NotBlank
    @Length(min = 11, max = 11)
    @Pattern(regexp = "^(1[0-9])\\d{9}$")
    private String mobilePhoneNumber;

    @NotBlank
    @Length(min = 6, max = 255)
    private String password;

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
        user.setMobilePhoneNumber(mobilePhoneNumber);
        user.setPassword(password);
        return user;
    }
}

package com.rumofuture.nemo.model.dto.request.user;

import com.rumofuture.nemo.model.domain.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class UserPasswordUpdateDTO implements UserDTO {

    @NotBlank
    @Length(min = 6, max = 255)
    private String oldPassword;

    @NotBlank
    @Length(min = 6, max = 255)
    private String newPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public User convertToUser() {
        return null;
    }
}

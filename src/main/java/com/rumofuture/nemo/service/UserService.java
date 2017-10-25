package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.User;

public interface UserService {
    int signUp(User user);
    User login(String mobilePhoneNumber);

    int updateUserPassword(User user);
    int updateUserInfo(User user);
    User getUserById(Long id);
    User getUserByMobilePhoneNumber(String mobilePhoneNumber);
}

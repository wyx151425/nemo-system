package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.model.dao.UserDao;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public int signUp(User user) {
        try {
            return userDao.saveUser(user);
        } catch (SQLException e) {
            return 0;
        }
    }

    @Override
    public User login(String mobilePhoneNumber) {
        try {
            return userDao.getUserByMobilePhoneNumber(mobilePhoneNumber);
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    @Transactional
    public int updateUserPassword(User user) {
        try {
            return userDao.updateUserPassword(user);
        } catch (SQLException e) {
            return 0;
        }
    }

    @Override
    @Transactional
    public int updateUserInfo(User user) {
        try {
            return userDao.updateUserInfo(user);
        } catch (SQLException e) {
            return 0;
        }
    }

    @Override
    public User getUserById(Long id) {
        try {
            return userDao.getUserById(id);
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public User getUserByMobilePhoneNumber(String mobilePhoneNumber) {
        try {
            return userDao.getUserByMobilePhoneNumber(mobilePhoneNumber);
        } catch (SQLException e) {
            return null;
        }
    }
}

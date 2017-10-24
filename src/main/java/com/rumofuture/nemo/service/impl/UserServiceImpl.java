package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.model.dao.UserDao;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void saveUser(User user) {
        try {
            userDao.saveUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getUserById(Long id) {
        try {
            userDao.getUserById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

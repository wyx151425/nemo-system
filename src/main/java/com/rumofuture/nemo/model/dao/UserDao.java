package com.rumofuture.nemo.model.dao;

import com.rumofuture.nemo.model.domain.User;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * Created by WangZhenqi on 2017/10/24.
 */

@Repository
public interface UserDao {
    int saveUser(User user) throws SQLException;
    int updateUserAvatar(User user) throws SQLException;
    int updateUserPortrait(User user) throws SQLException;
    int updateUserPassword(User user) throws SQLException;
    int updateUserInfo(User user) throws SQLException;
    User getUserById(Serializable id) throws SQLException;
    User getUserByMobilePhoneNumber(String mobilePhoneNumber) throws SQLException;
}

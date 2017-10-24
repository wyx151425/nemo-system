package com.rumofuture.nemo.model.dao;

import com.rumofuture.nemo.model.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)  // spring的单元测试
@ContextConfiguration({"classpath:spring/spring-*.xml"})  // 上下文配置
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("王振琦");
        user.setMobilePhoneNumber("18930721259");
        user.setPassword("wyx151425");
        try {
            userDao.save(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGet() {
        try {
            userDao.get(1L);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

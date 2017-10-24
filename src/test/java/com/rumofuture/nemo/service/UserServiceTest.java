package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  // spring的单元测试
@ContextConfiguration({"classpath:spring/spring-*.xml"})  // 上下文配置
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("王振琦");
        user.setMobilePhoneNumber("17853711915");
        user.setPassword("wyx151425");
        userService.saveUser(user);
    }

    @Test
    public void testGet() {
        userService.getUserById(1L);
    }
}

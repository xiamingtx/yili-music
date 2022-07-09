package com.bilitech.yilimusic.repository;

import com.bilitech.yilimusic.entity.User;
import com.bilitech.yilimusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author 夏明
 * @version 1.0
 */
@SpringBootTest
class UserInfoRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void testUser() {
        User user = new User();
        user.setUsername("xm");
        user.setNickname("程序员xm");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("123456");
        user.setGender(Gender.MALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Timestamp(new Date().getTime()));

        User savedUser = repository.save(user);
        User res = repository.getByUsername("xm");
        System.out.println(savedUser);
        System.out.println(res);
    }
}
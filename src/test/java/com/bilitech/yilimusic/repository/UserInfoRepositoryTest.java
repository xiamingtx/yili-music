package com.bilitech.yilimusic.repository;

import com.bilitech.yilimusic.entity.UserInfo;
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
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("xm");
        userInfo.setNickname("程序员xm");
        userInfo.setEnabled(true);
        userInfo.setLocked(false);
        userInfo.setPassword("123456");
        userInfo.setGender(Gender.MALE);
        userInfo.setLastLoginIp("127.0.0.1");
        userInfo.setLastLoginTime(new Timestamp(new Date().getTime()));

        UserInfo savedUserInfo = repository.save(userInfo);
        UserInfo res = repository.getByUsername("xm");
        System.out.println(savedUserInfo);
        System.out.println(res);
    }
}
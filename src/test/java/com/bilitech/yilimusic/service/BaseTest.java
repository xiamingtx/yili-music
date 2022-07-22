package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.UserCreateRequest;
import com.bilitech.yilimusic.enums.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 夏明
 * @version 1.0
 */
@SpringBootTest
public abstract class BaseTest {

    @Autowired
    UserService userService;

    @BeforeEach
    void setDefaultUser() {
        UserCreateRequest userCreateRequest = new UserCreateRequest();
        userCreateRequest.setUsername("yili");
        userCreateRequest.setNickname("yili");
        userCreateRequest.setPassword("123456");
        userCreateRequest.setGender(Gender.MALE);
        userService.create(userCreateRequest);
    }
}

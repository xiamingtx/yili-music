package com.bilitech.yilimusic.controller;

import com.bilitech.yilimusic.mapper.UserMapper;
import com.bilitech.yilimusic.service.UserService;
import com.bilitech.yilimusic.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 夏明
 * @version 1.0
 */
@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    UserService userService;

    UserMapper userMapper;

    @GetMapping("/")
    List<UserVo> list() {
        return userService.list().stream()
                .map(userMapper::toVo).collect(Collectors.toList());
    }

    @Autowired
    public void setUserMapperMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

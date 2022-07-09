package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.UserCreateDto;
import com.bilitech.yilimusic.dto.UserDto;
import com.bilitech.yilimusic.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
public interface UserService extends UserDetailsService {
    List<UserDto> list();

    UserDto create(UserCreateDto userCreateDto);

    @Override
    User loadUserByUsername(String username) throws UsernameNotFoundException;
}

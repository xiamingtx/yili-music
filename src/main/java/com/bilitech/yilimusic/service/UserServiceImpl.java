package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.UserDto;
import com.bilitech.yilimusic.mapper.UserMapper;
import com.bilitech.yilimusic.repository.UserRepository;
import com.bilitech.yilimusic.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 夏明
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    UserRepository repository;

    UserMapper mapper;

    @Override
    public List<UserDto> list() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }
}

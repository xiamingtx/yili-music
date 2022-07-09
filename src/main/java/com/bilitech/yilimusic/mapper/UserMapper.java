package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.UserCreateDto;
import com.bilitech.yilimusic.dto.UserDto;
import com.bilitech.yilimusic.entity.User;
import com.bilitech.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
@Primary
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto user);

    User createEntity(UserCreateDto userCreateDto);
}

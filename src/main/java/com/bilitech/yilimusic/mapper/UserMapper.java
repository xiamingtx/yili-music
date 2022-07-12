package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.UserCreateRequest;
import com.bilitech.yilimusic.dto.UserDto;
import com.bilitech.yilimusic.dto.UserUpdateRequest;
import com.bilitech.yilimusic.entity.User;
import com.bilitech.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto user);

    User createEntity(UserCreateRequest userCreateRequest);

    User updateEntity(@MappingTarget User user, UserUpdateRequest userUpdateRequest);
}

package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.UserDto;
import com.bilitech.yilimusic.entity.UserInfo;
import com.bilitech.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(UserInfo user);

    UserVo toVo(UserDto user);
}

package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.vo.RoleVo;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class UserDto {

    private String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles; // 关联数据
}

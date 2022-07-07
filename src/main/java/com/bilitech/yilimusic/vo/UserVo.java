package com.bilitech.yilimusic.vo;

import com.bilitech.yilimusic.entity.RoleInfo;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class UserVo {

    private String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles; // 关联数据
}

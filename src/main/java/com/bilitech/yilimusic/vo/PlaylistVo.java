package com.bilitech.yilimusic.vo;

import com.bilitech.yilimusic.enums.PlayListStatus;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class PlaylistVo extends BaseVo {

    private String name;

    private String description;

    private FileVo cover;

    private PlayListStatus status;

    private UserVo creator;

    private List<MusicVo> musicList;
}

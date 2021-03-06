package com.bilitech.yilimusic.vo;

import com.bilitech.yilimusic.enums.MusicStatus;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class MusicVo extends BaseVo {
    private String name;

    private MusicStatus status;

    private String description;

    private FileVo file;

    private List<ArtistVo> artistList;
}

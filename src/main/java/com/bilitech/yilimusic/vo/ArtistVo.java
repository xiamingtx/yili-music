package com.bilitech.yilimusic.vo;

import com.bilitech.yilimusic.dto.FileDto;
import com.bilitech.yilimusic.enums.ArtistStatus;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class ArtistVo extends BaseVo {
    private String name;

    private String remark;

    private FileDto photo;

    private List<MusicVo> musicList;

    private ArtistStatus status;
}

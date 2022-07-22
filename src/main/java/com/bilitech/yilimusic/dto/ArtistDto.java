package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.enums.ArtistStatus;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class ArtistDto extends BaseDto {

    private String name;

    private String remark;

    private FileDto photo;

    private List<MusicDto> musicList;

    private ArtistStatus status;
}

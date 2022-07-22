package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.enums.PlayListStatus;
import lombok.Data;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class PlaylistDto extends BaseDto {

    private String name;

    private String description;

    private FileDto cover;

    private PlayListStatus status;

    private UserDto creator;

    private List<MusicDto> musicList;
}

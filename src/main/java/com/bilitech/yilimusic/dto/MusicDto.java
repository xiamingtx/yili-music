package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.enums.MusicStatus;
import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class MusicDto extends BaseDto {

    private String name;

    private MusicStatus status;

    private String description;

    private FileDto file;
}

package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.enums.MusicStatus;
import lombok.Data;

import java.util.Date;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class MusicDto {
    private String id;

    private String name;

    private MusicStatus status;

    private String description;

    private Date createdTime;

    private Date updatedTime;
}

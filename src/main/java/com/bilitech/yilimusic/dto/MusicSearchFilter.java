package com.bilitech.yilimusic.dto;

import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class MusicSearchFilter {
    private String name = "";

    private Integer page = 1;

    private Integer size = 10;
}

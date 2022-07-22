package com.bilitech.yilimusic.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public abstract class BaseDto {

    private String id;

    private Date createdTime;

    private Date updatedTime;
}

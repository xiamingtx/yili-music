package com.bilitech.yilimusic.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public abstract class BaseDto {

    protected String id;

    protected Date createdTime;

    protected Date updatedTime;
}

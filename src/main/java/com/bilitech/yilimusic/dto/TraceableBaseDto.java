package com.bilitech.yilimusic.dto;

import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class TraceableBaseDto extends BaseDto {
    private UserDto createdBy;

    private UserDto updatedBy;
}
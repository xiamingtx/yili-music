package com.bilitech.yilimusic.dto;

import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class BaseSearchFilter {

    @Min(value = 1, message = "page最小值为1")
    private Integer page = 1;

    @Min(value = 1, message = "size最小值为1")
    private Integer size = 10;
}

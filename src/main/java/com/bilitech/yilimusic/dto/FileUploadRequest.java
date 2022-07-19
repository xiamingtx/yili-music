package com.bilitech.yilimusic.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class FileUploadRequest {

    @NotBlank(message = "文件名不能为空")
    private String name;

    private Integer size;

    @NotBlank(message = "后缀不能为空")
    private String ext;

    @NotBlank(message = "key不能为空")
    private String key;
}

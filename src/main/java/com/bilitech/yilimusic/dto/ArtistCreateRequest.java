package com.bilitech.yilimusic.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class ArtistCreateRequest {

    @NotBlank(message = "歌手名不能为空")
    private String name;

    private String remark;

    @NotBlank(message = "歌手照片必须上传")
    private String photoId;
}

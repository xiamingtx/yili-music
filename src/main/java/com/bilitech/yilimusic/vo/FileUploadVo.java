package com.bilitech.yilimusic.vo;

import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class FileUploadVo {

    private String secretId;

    private String secretKey;

    private String sessionToken;

    private String key;

    private String fileId;

    private Long startTime;

    private Long expiredTime;
}

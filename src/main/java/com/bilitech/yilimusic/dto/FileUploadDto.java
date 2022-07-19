package com.bilitech.yilimusic.dto;

import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class FileUploadDto {

    private String secretId;

    private String secreteKey;

    private String sessionToken;

    private String key;

    private String bucket;

    private String region;
}

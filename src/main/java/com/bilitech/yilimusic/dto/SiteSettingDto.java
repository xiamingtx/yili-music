package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.enums.Storage;
import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class SiteSettingDto {
    private String bucket;

    private String region;

    private Storage storage;
}

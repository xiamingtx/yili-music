package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.enums.FileStatus;
import com.bilitech.yilimusic.enums.FileType;
import com.bilitech.yilimusic.enums.Storage;
import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class FileDto extends BaseDto {

    private String name;

    private String key;

    private String uri;

    private String ext;

    private Long size;

    private FileType type;

    private Storage Storage;

    private FileStatus status;
}

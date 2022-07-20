package com.bilitech.yilimusic.vo;

import com.bilitech.yilimusic.enums.FileStatus;
import com.bilitech.yilimusic.enums.FileType;
import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class FileVo extends BaseVo {

    private String name;

    private String key;

    private String ext;

    private Long size;

    private FileType type;

    private FileStatus status;
}

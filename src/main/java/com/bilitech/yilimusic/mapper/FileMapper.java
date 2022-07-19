package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.FileUploadRequest;
import com.bilitech.yilimusic.entity.File;
import org.mapstruct.Mapper;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface FileMapper {
    File createEntity(FileUploadRequest fileUploadRequest);
}

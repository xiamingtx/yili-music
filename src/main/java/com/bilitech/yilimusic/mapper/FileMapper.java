package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.FileDto;
import com.bilitech.yilimusic.dto.FileUploadRequest;
import com.bilitech.yilimusic.entity.File;
import com.bilitech.yilimusic.vo.FileVo;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
@DecoratedWith(FileMapperDecorator.class)
public interface FileMapper {
    File createEntity(FileUploadRequest fileUploadRequest);

    FileVo toVo(FileDto file);

    FileDto toDto(File file);

    File toEntity(FileDto file);
}

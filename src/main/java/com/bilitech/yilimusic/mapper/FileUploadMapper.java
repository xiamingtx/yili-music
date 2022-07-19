package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.FileUploadDto;
import com.bilitech.yilimusic.vo.FileUploadVo;
import org.mapstruct.Mapper;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface FileUploadMapper {
    FileUploadVo toVo(FileUploadDto FileUploadDto);
}

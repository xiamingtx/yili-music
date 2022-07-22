package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.FileDto;
import com.bilitech.yilimusic.entity.File;
import com.bilitech.yilimusic.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

/**
 * @author 夏明
 * @version 1.0
 */
public abstract class FileMapperDecorator implements FileMapper {

    @Autowired
    @Qualifier("delegate")
    private FileMapper delegate;

    @Autowired
    private Map<String, StorageService> storageServices;

    @Override
    public FileDto toDto(File file) {
        FileDto fileDto = delegate.toDto(file);
        if (fileDto == null) {
            return null;
        }

        // Todo: 待修复
        if (fileDto.getStorage() == null) {
            return null;
        }
        fileDto.setUri(storageServices.get(fileDto.getStorage().name()).getFileUri(fileDto.getKey()));
        return fileDto;
    }
}

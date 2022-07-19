package com.bilitech.yilimusic.service.impl;

import com.bilitech.yilimusic.dto.FileUploadDto;
import com.bilitech.yilimusic.service.StorageService;
import org.springframework.stereotype.Service;

/**
 * @author 夏明
 * @version 1.0
 */
@Service("COS")
public class CosStorageServiceImpl implements StorageService {
    @Override
    public FileUploadDto initUpload() {
        return null;
    }
}

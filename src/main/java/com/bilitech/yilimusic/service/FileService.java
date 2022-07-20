package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.FileDto;
import com.bilitech.yilimusic.dto.FileUploadDto;
import com.bilitech.yilimusic.dto.FileUploadRequest;

/**
 * @author 夏明
 * @version 1.0
 */
public interface FileService {

    FileUploadDto initUpload(FileUploadRequest fileUploadRequest);

    FileDto finishUpload(String id);
}

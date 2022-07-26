package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.*;
import com.bilitech.yilimusic.mapper.ArtistMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

/**
 * @author 夏明
 * @version 1.0
 */
@SpringBootTest
@Slf4j
class ArtistServiceTest extends BaseTest {

    @Autowired
    ArtistService artistService;

    @Autowired
    FileService fileService;

    @Autowired
    ArtistMapper artistMapper;

    private String photoId;

    @Test
    @WithMockUser(username = "yili")
    void create() {
        ArtistCreateRequest artistCreateRequest = new ArtistCreateRequest();
        artistCreateRequest.setName("周杰伦");
        artistCreateRequest.setRemark("Jay Chou");
        artistCreateRequest.setPhotoId(photoId);
        ArtistDto artistDto = artistService.create(artistMapper.toDto(artistCreateRequest));
        Assertions.assertEquals(artistCreateRequest.getName(), artistDto.getName());
        Assertions.assertEquals(artistCreateRequest.getRemark(), artistDto.getRemark());
        Assertions.assertEquals("yili", artistDto.getCreatedBy().getUsername());
    }

    @BeforeEach
    void setDefaultPhoto() {
        FileUploadRequest fileUploadRequest = new FileUploadRequest();
        fileUploadRequest.setName("测试文件名");
        fileUploadRequest.setExt("mp3");
        fileUploadRequest.setKey("835741aba850778a5b06bfd57f55c98c");
        fileUploadRequest.setSize(30000L);
        FileUploadDto fileUploadDto = fileService.initUpload(fileUploadRequest);
        FileDto finishedFile = fileService.finishUpload(fileUploadDto.getFileId());
        photoId = finishedFile.getId();
    }
}
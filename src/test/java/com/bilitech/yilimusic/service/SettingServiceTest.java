package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.SiteSettingDto;
import com.bilitech.yilimusic.enums.Storage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 夏明
 * @version 1.0
 */
@SpringBootTest
class SettingServiceTest {

    private SettingService service;

    @Test
    void getSiteSetting() {
        SiteSettingDto siteSetting = service.getSiteSetting();
        Assertions.assertNotNull(siteSetting.getBucket());
        Assertions.assertNotNull(siteSetting.getRegion());
        Assertions.assertInstanceOf(Storage.class, siteSetting.getStorage());
    }

    @Autowired
    public void setService(SettingService service) {
        this.service = service;
    }
}
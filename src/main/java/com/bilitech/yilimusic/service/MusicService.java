package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.MusicDto;
import com.bilitech.yilimusic.entity.Music;

/**
 * @author 夏明
 * @version 1.0
 */
public interface MusicService extends GeneralService<Music, MusicDto> {

    void publish(String id);

    void close(String id);
}

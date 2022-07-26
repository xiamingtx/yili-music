package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.MusicDto;
import com.bilitech.yilimusic.dto.MusicSearchFilter;
import com.bilitech.yilimusic.entity.Music;
import org.springframework.data.domain.Page;

/**
 * @author 夏明
 * @version 1.0
 */
public interface MusicService extends GeneralService<Music, MusicDto> {

    Page<MusicDto> search(MusicSearchFilter musicSearchFilter);

    void publish(String id);

    void close(String id);
}

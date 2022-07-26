package com.bilitech.yilimusic.service;

import com.bilitech.yilimusic.dto.ArtistDto;
import com.bilitech.yilimusic.dto.ArtistSearchFilter;
import com.bilitech.yilimusic.entity.Artist;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
public interface ArtistService extends GeneralService<Artist, ArtistDto> {

    List<ArtistDto> list();

    Page<ArtistDto> search(ArtistSearchFilter filter);
}

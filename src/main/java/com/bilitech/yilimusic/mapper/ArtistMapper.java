package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.ArtistCreateRequest;
import com.bilitech.yilimusic.dto.ArtistDto;
import com.bilitech.yilimusic.dto.ArtistUpdateRequest;
import com.bilitech.yilimusic.entity.Artist;
import com.bilitech.yilimusic.vo.ArtistVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring", uses = {FileMapper.class, MusicMapper.class})
public interface ArtistMapper {

    Artist createEntity(ArtistCreateRequest artistCreateRequest);

    Artist updateEntity(@MappingTarget Artist artist, ArtistUpdateRequest updateRequest);

    ArtistDto toDto(Artist artist);

    ArtistVo toVo(ArtistDto artist);
}
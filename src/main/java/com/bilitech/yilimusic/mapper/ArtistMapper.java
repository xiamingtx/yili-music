package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.ArtistCreateRequest;
import com.bilitech.yilimusic.dto.ArtistDto;
import com.bilitech.yilimusic.dto.ArtistUpdateRequest;
import com.bilitech.yilimusic.entity.Artist;
import com.bilitech.yilimusic.vo.ArtistVo;
import org.mapstruct.Mapper;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring", uses = {FileMapper.class, MusicMapper.class})
public interface ArtistMapper extends MapperInterface<Artist, ArtistDto> {

    ArtistDto toDto(ArtistCreateRequest artistCreateRequest);

    ArtistDto toDto(ArtistUpdateRequest updateRequest);

    ArtistVo toVo(ArtistDto artist);
}

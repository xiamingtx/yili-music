package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.PlaylistDto;
import com.bilitech.yilimusic.entity.Playlist;
import com.bilitech.yilimusic.vo.PlaylistVo;
import org.mapstruct.Mapper;

/**
 * @author 夏明
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface PlaylistMapper {

    PlaylistDto toDto(Playlist playlist);

    PlaylistVo toVo(PlaylistDto playlist);
}

package com.bilitech.yilimusic.controller;

import com.bilitech.yilimusic.mapper.PlaylistMapper;
import com.bilitech.yilimusic.service.PlaylistService;
import com.bilitech.yilimusic.vo.PlaylistVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 夏明
 * @version 1.0
 */
@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private PlaylistService playlistService;

    private PlaylistMapper playlistMapper;

    @GetMapping("/{id}")
    public PlaylistVo get(@PathVariable String id) {
        return playlistMapper.toVo(playlistService.get(id));
    }

    @Autowired
    public void setPlaylistService(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @Autowired
    public void setPlaylistMapper(PlaylistMapper playlistMapper) {
        this.playlistMapper = playlistMapper;
    }
}

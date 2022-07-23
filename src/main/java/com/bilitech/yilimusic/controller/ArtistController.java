package com.bilitech.yilimusic.controller;

import com.bilitech.yilimusic.dto.ArtistCreateRequest;
import com.bilitech.yilimusic.dto.ArtistUpdateRequest;
import com.bilitech.yilimusic.mapper.ArtistMapper;
import com.bilitech.yilimusic.service.ArtistService;
import com.bilitech.yilimusic.vo.ArtistVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 夏明
 * @version 1.0
 */
@RestController
@RequestMapping("/artists")
public class ArtistController {

    private ArtistService artistService;

    private ArtistMapper artistMapper;

    @PostMapping
    @Transactional
    public ArtistVo create(@Validated @RequestBody ArtistCreateRequest artistCreateRequest) {
        return artistMapper.toVo(artistService.create(artistCreateRequest));
    }

    @PutMapping("/{id}")
    public ArtistVo update(@PathVariable String id, @RequestBody ArtistUpdateRequest artistUpdateRequest) {
        return artistMapper.toVo(artistService.update(id, artistUpdateRequest));
    }

    @GetMapping
    public List<ArtistVo> list() {
        return artistService.list().stream().map(artistMapper::toVo).collect(Collectors.toList());
    }

    @Autowired
    public void setArtistService(ArtistService artistService) {
        this.artistService = artistService;
    }

    @Autowired
    public void setArtistMapper(ArtistMapper artistMapper) {
        this.artistMapper = artistMapper;
    }
}

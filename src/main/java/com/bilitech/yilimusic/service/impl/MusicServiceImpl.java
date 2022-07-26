package com.bilitech.yilimusic.service.impl;

import com.bilitech.yilimusic.dto.MusicDto;
import com.bilitech.yilimusic.dto.MusicSearchFilter;
import com.bilitech.yilimusic.entity.Music;
import com.bilitech.yilimusic.enums.MusicStatus;
import com.bilitech.yilimusic.exception.ExceptionType;
import com.bilitech.yilimusic.mapper.MapperInterface;
import com.bilitech.yilimusic.mapper.MusicMapper;
import com.bilitech.yilimusic.repository.MusicRepository;
import com.bilitech.yilimusic.repository.specs.MusicSpecification;
import com.bilitech.yilimusic.repository.specs.SearchCriteria;
import com.bilitech.yilimusic.repository.specs.SearchOperation;
import com.bilitech.yilimusic.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author 夏明
 * @version 1.0
 */
@Service
public class MusicServiceImpl extends GeneralServiceImpl<Music, MusicDto> implements MusicService {

    private MusicRepository repository;

    private MusicMapper mapper;

    @Override
    public MusicDto create(MusicDto musicDto) {
        return super.create(musicDto);
    }

    @Override
    public Page<MusicDto> search(MusicSearchFilter musicSearchFilter) {
        if (musicSearchFilter == null) {
            musicSearchFilter = new MusicSearchFilter();
        }
        MusicSpecification specs = new MusicSpecification();
        specs.add(new SearchCriteria("name", musicSearchFilter.getName(), SearchOperation.MATCH));
        Sort sort = Sort.by(Sort.Direction.DESC, "createdTime");
        Pageable pageable = PageRequest.of(musicSearchFilter.getPage() - 1, musicSearchFilter.getSize(), sort);
        return repository.findAll(specs, pageable).map(mapper::toDto);
    }

    @Override
    public void publish(String id) {
        Music music = getEntity(id);
        music.setStatus(MusicStatus.PUBLISHED);
        repository.save(music);
    }

    @Override
    public void close(String id) {
        Music music = getEntity(id);
        music.setStatus(MusicStatus.CLOSED);
        repository.save(music);
    }

    @Autowired
    public void setRepository(MusicRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setMapper(MusicMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public JpaRepository<Music, String> getRepository() {
        return repository;
    }

    @Override
    public MapperInterface<Music, MusicDto> getMapper() {
        return mapper;
    }

    @Override
    public ExceptionType getNotFoundExceptionType() {
        return ExceptionType.MUSIC_NOT_FOUND;
    }
}

package com.bilitech.yilimusic.repository;

import com.bilitech.yilimusic.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 夏明
 * @version 1.0
 */
public interface MusicRepository extends JpaRepository<Music, String>, JpaSpecificationExecutor<Music> {
}

package com.bilitech.yilimusic.repository;

import com.bilitech.yilimusic.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 夏明
 * @version 1.0
 */
public interface MusicRepository extends JpaRepository<Music, String> {
}

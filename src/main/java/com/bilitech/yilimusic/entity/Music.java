package com.bilitech.yilimusic.entity;

import com.bilitech.yilimusic.enums.MusicStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

/**
 * @author 夏明
 * @version 1.0
 */
@Entity
@Data
public class Music extends AbstractEntity {
    private String name;

    @Enumerated(EnumType.STRING)
    private MusicStatus status;

    private String description;

    @OneToOne
    private File file;
}

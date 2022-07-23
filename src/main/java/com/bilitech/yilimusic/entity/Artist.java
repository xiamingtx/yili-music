package com.bilitech.yilimusic.entity;

import com.bilitech.yilimusic.enums.ArtistStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */
@Entity
@Data
public class Artist extends TraceableBaseEntity {

    private String name;

    private String remark;

    @OneToOne(cascade = CascadeType.PERSIST)
    private File photo;

    @ManyToMany
    @JoinTable(name = "artist_music", joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "music_id", referencedColumnName = "id"))
    private List<Music> musicList;

    @Enumerated(EnumType.STRING)
    private ArtistStatus status;
}

package com.bilitech.yilimusic.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author 夏明
 * @version 1.0
 */
@Entity
@Data
public class RoleInfo extends AbstractEntity{

    private String name;

    private String title;
}

package com.bilitech.yilimusic.entity;

import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
@MappedSuperclass
abstract class TraceableBaseEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_id")
    protected User createdBy;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by_user_id")
    protected User updatedBy;
}
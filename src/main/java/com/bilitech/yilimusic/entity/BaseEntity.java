package com.bilitech.yilimusic.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author 夏明
 * @version 1.0
 */
@MappedSuperclass // 基类
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(generator = "ksuid")
    @GenericGenerator(name = "ksuid", strategy = "com.bilitech.yilimusic.utils.KsuidIdentifierGenerator")
    private String id; // 要添加MappedSuperclass否则子类不会检测id

    @CreationTimestamp // 创建时更新时间
    private Date createdTime;

    @UpdateTimestamp // 修改时更新时间
    private Date updatedTime;
}

package com.bilitech.yilimusic.service.impl;

import com.bilitech.yilimusic.dto.BaseDto;
import com.bilitech.yilimusic.entity.TraceableBaseEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 夏明
 * @version 1.0
 */
abstract class TraceableGeneralServiceImpl<Entity extends TraceableBaseEntity, Dto extends BaseDto> extends GeneralServiceImpl<Entity, Dto> {

    @Override
    public Dto create(Dto dto) {
        Entity entity = getMapper().toEntity(dto);
        entity.setCreatedBy(getCurrentUserEntity());
        entity.setUpdatedBy(getCurrentUserEntity());
        return getMapper().toDto(getRepository().save(entity));
    }

    @Override
    @Transactional
    public Dto update(String id, Dto dto) {
        // Todo: Dto可能无法控制更新字段
        Entity existedEntity = getEntity(id);
        Entity entity = getMapper().updateEntity(existedEntity, dto);
        entity.setUpdatedBy(getCurrentUserEntity());
        Entity updatedEntity = getRepository().save(entity);
        return getMapper().toDto(updatedEntity);
    }
}

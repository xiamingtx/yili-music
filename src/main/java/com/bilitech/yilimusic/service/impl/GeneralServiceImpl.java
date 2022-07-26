package com.bilitech.yilimusic.service.impl;

import com.bilitech.yilimusic.dto.BaseDto;
import com.bilitech.yilimusic.entity.BaseEntity;
import com.bilitech.yilimusic.exception.BizException;
import com.bilitech.yilimusic.service.GeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author 夏明
 * @version 1.0
 */
public abstract class GeneralServiceImpl<Entity extends BaseEntity, Dto extends BaseDto> extends BaseService implements GeneralService<Entity, Dto> {

    @Override
    public Dto create(Dto dto) {
        Entity entity = getMapper().toEntity(dto);
        return getMapper().toDto(getRepository().save(entity));
    }

    @Override
    public Dto get(String id) {
        return getMapper().toDto(getEntity(id));
    }

    @Override
    @Transactional
    public Dto update(String id, Dto dto) {
        // Todo: Dto可能无法控制更新字段
        Entity existedEntity = getEntity(id);
        Entity updatedEntity = getRepository().save(getMapper().updateEntity(existedEntity, dto));
        return getMapper().toDto(updatedEntity);
    }

    protected Entity getEntity(String id) {
        Optional<Entity> optionalEntity = getRepository().findById(id);
        if (!optionalEntity.isPresent()) {
            throw new BizException(getNotFoundExceptionType());
        }
        return optionalEntity.get();
    }

    @Override
    public void delete(String id) {
        Entity existedEntity = getEntity(id);
        getRepository().delete(existedEntity);
    }

    @Override
    public Page<Dto> search(Dto dto, Pageable pageable) {
        return null;
    }
}

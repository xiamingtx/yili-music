package com.bilitech.yilimusic.repository.specs;

import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class SearchCriteria {
    private String key;
    private Object value;
    private SearchOperation operation;

    public SearchCriteria(String key, Object value, SearchOperation operation) {
        this.key = key;
        this.value = value;
        this.operation = operation;
    }
}
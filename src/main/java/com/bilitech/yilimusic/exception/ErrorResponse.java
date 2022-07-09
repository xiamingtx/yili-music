package com.bilitech.yilimusic.exception;

import lombok.Data;

/**
 * @author 夏明
 * @version 1.0
 */
@Data
public class ErrorResponse {

    private Integer code;

    private String message;

    private Object trace;
}

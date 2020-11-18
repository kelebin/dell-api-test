package com.kelebin.utils;

public enum httpStatusEnum {

    OK(200, "OK"),
    Created(201, "Created"),
    NoContent(204, "No content"),
    BadRequest(400,"Bad Request"),
    NotFound(404,"Not Found"),
    InternalError(500,"Internal Error");


    private Integer code;

    private String descricao;

    httpStatusEnum(Integer code, String desc) {

        this.code = code;
        this.descricao = desc;
    }

    public Integer getCode() {
        return this.code;
    }
}

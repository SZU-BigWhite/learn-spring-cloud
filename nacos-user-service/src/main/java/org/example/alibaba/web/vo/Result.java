package org.example.alibaba.web.vo;

import lombok.Data;

@Data
public class Result<T> {
    private T data;

    private String message;

    private int code;

    public Result() {
    }

    public Result(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public Result(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }
}

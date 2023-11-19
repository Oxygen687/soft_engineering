package com.clean.backend.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.alibaba.fastjson2.JSON;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse<T> {
    private int code;
    private String msg;
    private T entity;

    public String success(T entity) {
        this.code = 0;
        this.msg = "ok";
        this.entity = entity;
        return toString();
    }

    public String fail(String reason) {
        this.code = 1;
        this.msg = reason;
        return toString();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
package com.wztedu.controller.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;

    private String message;

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R() {

    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public R(String message) {
        this.flag = false;
        this.message = message;
    }
}

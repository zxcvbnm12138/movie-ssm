package com.itheima.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private Integer code;

    private String msg;

    private Object data;

    public CommonResult(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }
    public CommonResult(Integer code,String msg ) {
        this.code = code;
        this.msg = msg;
    }

}

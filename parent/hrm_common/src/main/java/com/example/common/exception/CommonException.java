package com.example.common.exception;

import com.example.common.entity.ResultCode;
import lombok.Getter;

/**
 * 自定义异常
 *
 * @author :        ChenYanxin
 * @date :          2019/2/24 17:18
 */
@Getter
public class CommonException extends Exception {

    private ResultCode resultCode;

    public CommonException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}

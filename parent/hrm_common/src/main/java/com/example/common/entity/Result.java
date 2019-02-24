package com.example.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据响应对象
 *
 * @author :        ChenYanxin
 * @date :          2019/2/24 16:35
 */
@Data
public class Result {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 操作信息
     */
    private String msg;
    /**
     * 结果数据
     */
    private Object data;

    public Result(ResultCode code) {
        this.success = code.isSuccess();
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public Result(ResultCode code, Object data) {
        this.success = code.isSuccess();
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.data = data;
    }

    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }

    public static Result error() {
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result fail() {
        return new Result(ResultCode.FAIL);
    }
}

package com.example.common.entity;

/**
 * 公共返回码
 *
 * @author :        ChenYanxin
 * @date :          2019/2/24 16:27
 */
public enum ResultCode {

    /**
     * 返回状态信息
     */
    SUCCESS(true, 10000, "操作成功"),
    FAIL(false, 10001, "操作失败"),
    UNAUTHENTICATED(false, 10002, "未登录"),
    UNAUTHORISE(false, 10003, "权限不足"),
    SERVER_ERROR(false, 99999, "系统忙");
    /**
     * 用户操作返回码 2xxxx
     */
    /**
     * 企业操作返回码 3xxxx
     */
    /**
     * 权限操作返回码 4xxxx
     */
    /**
     * 其他操作返回码 5xxxx
     */
    private boolean success;
    private int code;
    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResultCode(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }
}

package com.blackstar.entity;

/**
 * @Auther: DingZhichao
 * @Date: 2020/10/3 11:09
 * @Description:  返回结果状态码枚举类
 */
public enum  ResultCodeEnum {

    OK(200),ERROR(500);

    ResultCodeEnum(Integer code){
        this.code=code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }
}

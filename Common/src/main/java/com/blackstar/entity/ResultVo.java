package com.blackstar.entity;

import lombok.*;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:00
 * @Description: 返回值
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Builder
public class ResultVo<T> {
    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 返回信息
     */
    private  String message;

    /**
     * 访问成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultVo<T> ok(T data){
        return new ResultVoBuilder<T>().code(200)
                .data(data).message("请求访问成功").build();
    }

    /**
     * 访问失败
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResultVo<T> error(String message){
        return new ResultVoBuilder<T>().code(500).message(message).data(null).build();
    }

}

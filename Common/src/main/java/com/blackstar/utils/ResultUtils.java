package com.blackstar.utils;

import com.blackstar.entity.ResultVo;
import org.springframework.util.Assert;

/**
 * @Auther: DingZhichao
 * @Date: 2020/10/3 11:04
 * @Description: 返回结果处理工具类
 */
public class ResultUtils {
    /**
     * 解析返回结果
     *
     * @param resultVo
     * @param <T>
     * @return
     */
    public static <T>  T  parseResult(ResultVo<T> resultVo){
        Assert.notNull(resultVo,"返回结果不能为空");
        Integer code = resultVo.getCode();
        Assert.notNull(code,"返回状态码为空");
        return resultVo.getData();
    }

}

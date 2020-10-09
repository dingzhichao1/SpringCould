package com.blackstar.user;

import com.blackstar.entity.ResultVo;
import com.blackstar.user.vo.UserVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:57
 * @Description:
 */
@Component
public class SystemFallback implements SystemFeign {


    @Override
    public ResultVo<List<UserVo>> test() {
        return ResultVo.error("System服务调用失败");
    }
}

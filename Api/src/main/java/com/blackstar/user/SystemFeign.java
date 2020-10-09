package com.blackstar.user;

import com.blackstar.entity.ResultVo;
import com.blackstar.user.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:57
 * @Description:
 */
@FeignClient(name ="system" ,contextId = "user",fallback =SystemFallback.class )
public interface SystemFeign {

    @GetMapping("system/getUserList")
    ResultVo<List<UserVo>> test();

}

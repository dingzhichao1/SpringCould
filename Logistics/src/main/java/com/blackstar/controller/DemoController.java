package com.blackstar.controller;

import com.blackstar.entity.ResultVo;
import com.blackstar.user.SystemFeign;
import com.blackstar.user.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:04
 * @Description:
 */

@RestController
@RequestMapping("logistics")
public class DemoController {

    @Resource
    private SystemFeign systemFeign;

    @GetMapping("/getUserList")
    public ResultVo<List<UserVo>> test(HttpServletRequest request){
        ResultVo<List<UserVo>> testResult = systemFeign.test();
        systemFeign.test()
        List<UserVo> data = testResult.getData();
        return ResultVo.ok(data);

    }





}

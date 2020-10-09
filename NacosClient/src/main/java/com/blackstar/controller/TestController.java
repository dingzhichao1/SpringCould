package com.blackstar.controller;

import com.blackstar.config.ConfigProperties;
import com.blackstar.entity.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:04
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("nacosClient")
public class TestController {

    @Resource
    private ConfigProperties configProperties;

    @GetMapping("/getConfigInfo")
    public ResultVo<ConfigProperties> test(HttpServletRequest request){
        return ResultVo.ok(configProperties);

    }




}

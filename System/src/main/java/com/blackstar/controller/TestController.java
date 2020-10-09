package com.blackstar.controller;

import com.blackstar.entity.ResultVo;
import com.blackstar.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:04
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("system")
public class TestController {

    @GetMapping("/getUserList")
    public ResultVo<List<User>> test(HttpServletRequest request){
        String token = request.getHeader("token");

        log.info("system-token"+token);
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("王尼玛");
        user.setAge(23);
        userList.add(user);
        return ResultVo.ok(userList);

    }


    @GetMapping("/getToken")
    public ResultVo<String> getToken(HttpServletRequest request){
        String token = request.getHeader("token");
        return ResultVo.ok(token);
    }





}

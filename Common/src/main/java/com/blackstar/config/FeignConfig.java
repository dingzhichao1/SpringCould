package com.blackstar.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: DingZhichao
 * @Date: 2020/10/3 18:03
 * @Description: 拦截Feign的请求，设置Feign的参数
 */
public class FeignConfig implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes requestAttributes =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        requestTemplate.header("token",request.getHeader("token"));
    }
}

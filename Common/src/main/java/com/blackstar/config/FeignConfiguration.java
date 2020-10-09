package com.blackstar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: DingZhichao
 * @Date: 2020/10/3 18:53
 * @Description:
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public FeignConfig feignConfig(){
        return  new FeignConfig();

    }

}

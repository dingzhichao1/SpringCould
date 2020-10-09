package com.blackstar.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: DingZhichao
 * @Date: 2020/10/7 12:32
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "users")
@Data
public class ConfigProperties {
    private String name;
    private Integer age;
    private String sex;

}

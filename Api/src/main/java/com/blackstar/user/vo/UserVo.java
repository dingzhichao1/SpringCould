package com.blackstar.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 19:00
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

    private Integer id;
    private String name;
    private Integer age;
}

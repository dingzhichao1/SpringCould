package com.blackstar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: DingZhichao
 * @Date: 2020/9/26 18:12
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String name;
    private Integer age;


}

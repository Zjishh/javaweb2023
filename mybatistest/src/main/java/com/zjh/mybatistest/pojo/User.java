package com.zjh.mybatistest.pojo;

import lombok.Data;

/****************************
 * @project AAAjavaweb
 * @package com.zjh.mybatistest.pojo
 * @className User
 * @author Zjiah
 * @date 2023/9/13 18:18
 * @Description:   *
 ****************************/

@Data
public class User {
    private Integer id;
    private String name;
    private Short age;
    private Short gender;
    private String phone;
}

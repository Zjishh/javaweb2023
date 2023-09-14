package com.zjh.mybatistest.mapper;

import com.zjh.mybatistest.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/****************************
 * @project AAAjavaweb
 * @package com.zjh.mybatistest.mapper
 * @className UserMapper
 * @author Zjiah
 * @date 2023/9/13 18:22
 * @Description:   *
 ****************************/
@Mapper
//是程序的mapper接口  自动生成实现类 并将对象交给容器
public interface UserMapper {
    //查询
    @Select("select id, name, age, gender, phone from user")
    public List<User> list();
}

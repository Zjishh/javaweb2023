package com.zjh.mybatistest.mapper;

import com.zjh.mybatistest.pojo.Emp;
import com.zjh.mybatistest.pojo.User;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Mapper
public interface EmpMapper {

    @Delete("delete from emp where id = #{id}")
    public int delete(Integer id);

    //拿到主键
    @Options(useGeneratedKeys = true, keyProperty = "id")

    @Insert("insert into emp ( username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime});")
    public void insert(Emp emp);

//    @Update("update emp set username=#{username},name = #{name},gender=#{gender},image=#{image},job=#{job},entrydate=#{entrydate}," +
//            "dept_id=#{deptId},update_time=#{updateTime} where id=#{id}")
    public void updata(Emp emp);

    @Select("SELECT * FROM emp WHERE id =#{id}")
    public Emp getbyid(Integer id);

    //解决实体类和字段类型不一致
    //1起别名 update_time=>updateTime
//    @Select("select id")
//    public Emp getbyid(Integer id);

    //2@result 注解手动映射
//    @Results({
//            @Result(column = "dept_id",property = "deptId"),
//            @Result(column = "create_time",property = "createTime"),
//            @Result(column = "update_time",property = "updateTime")
//    })
//    @Select("SELECT * FROM emp WHERE id =#{id}")
//    public Emp getbyid(Integer id);

    ///3开启mybatis命名自动映射开关

    //条件查询
//    @Select("select * from emp where name like concat('%',#{name},'%') and gender=#{gender} and entrydate between #{t1} and #{t2} order by update_time desc ")
    public List<Emp> select(String name, Short gender, LocalDate t1, LocalDate t2);

//批量删除
    public void somedelete(List<Integer> ids );
}

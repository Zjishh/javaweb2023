package com.zjh.mybatistest;

import com.zjh.mybatistest.mapper.EmpMapper;
import com.zjh.mybatistest.mapper.UserMapper;
import com.zjh.mybatistest.pojo.Emp;
import com.zjh.mybatistest.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatistestApplicationTests {

    @Autowired(required = false) //依赖注入！！！！
//	private UserMapper userMapper;
    private EmpMapper empMapper;


    //    public void testselectall() {
//		List<User> list = userMapper.list();
//		list.stream().forEach(user -> {
//			System.out.println(user);
//		});
//	}
    @Test
    public void testupdata() {
        Emp emp = new Emp();
        emp.setId(1);
        emp.setUsername("user张家豪gaile");
        emp.setCreateTime(LocalDateTime.now());
        emp.setImage("6669599.jpg");
        emp.setName("改了张家豪");
//        emp.setJob((short) 13);
//        emp.setGender((short) 13);
//        emp.setEntrydate(LocalDate.of(2001, 9, 15));

//        emp.setDeptId(666);
        empMapper.updata(emp);
    }


//	@Test
//	public void testdelete() {
//		int delete = empMapper.delete(17);
//		System.out.println(delete);
//	}

//	@Test
//	public void inserttest(){
//
//	}
    @Test
	public void getbyid(){
        Emp getbyid = empMapper.getbyid(1);
        System.out.println(getbyid);
    }

    @Test
    public void select(){
        List<Emp> select = empMapper.select(null,(short)1,null,null);
        System.out.println(select);

    }
    @Test
    public void somgdeletetest(){
        List<Integer> ids = Arrays.asList(1, 17);
         empMapper.somedelete(ids);

    }

}

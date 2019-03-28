package com.caihua.myspringboot;

import com.caihua.bean.Dept;
import com.caihua.bean.Employee;
import com.caihua.bean.Position;
import com.caihua.bean.User;
import com.caihua.service.DeptService;
import com.caihua.service.EmpService;
import com.caihua.service.PositionService;
import com.caihua.service.UserService;
import com.caihua.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringbootApplicationTests {
    Employee employee = new Employee();
    @Autowired
    private DeptService deptService;
    @Autowired
    private EmpService empService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() throws ParseException {
        //userService.addUser(new User("蔡话",23,new Date()));
    }

}


package com.caihua.myspringboot;

import com.caihua.bean.Dept;
import com.caihua.bean.Employee;
import com.caihua.bean.Position;
import com.caihua.service.DeptService;
import com.caihua.service.EmpService;
import com.caihua.service.PositionService;
import com.caihua.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringbootApplicationTests {
    Employee employee=new Employee();
    @Autowired
    private DeptService deptService;
    @Autowired
    private EmpService empService;
    @Autowired
    private PositionService positionService;

    @Test
    public void contextLoads() {
        System.out.println(empService.findEmp(1));
    }

}


package com.caihua.aspect;

import com.caihua.bean.Dept;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AddAspect {
    @Pointcut("execution(* com.caihua.service.impl.*.add*(..))")
    public void addLog(){};

    @Before(value = "addLog()")
    public void before(JoinPoint joinPoint){
        Object[] objects=joinPoint.getArgs();
        for(Object obj:objects){
            log.info("传入参数："+obj.toString());
        }
    }

    @After("addLog()")
    public void after(){
        log.info("添加成功");
    }

    @AfterThrowing(value = "addLog()",throwing = "e")
    public void throwing(Exception e){
        log.info("添加失败"+e.getMessage());
    }
}

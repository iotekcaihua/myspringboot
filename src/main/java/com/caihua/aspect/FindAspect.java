package com.caihua.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class FindAspect {
    @Pointcut("execution(* com.caihua.service.impl.*.find*(..))")
    public void findLog(){}

   @Before("findLog()")
   public void before(JoinPoint joinPoint){
       Object[] objects=joinPoint.getArgs();
       for(Object obj:objects){
           log.info("传入参数："+obj.toString());
       }
   }

   @AfterReturning(value = "findLog()",returning = "result")
    public  void returning(Object result){
        log.info("查询成功："+result);
    }

}

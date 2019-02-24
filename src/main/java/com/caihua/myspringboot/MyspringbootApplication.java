package com.caihua.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = {"com.caihua.*"})
@MapperScan("com.caihua.mapper")
@ServletComponentScan(basePackages = {"com.caihua.filter","com.caihua.intecptor","com.caihua.Listener"})
public class MyspringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}


package com.caihua.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.caihua.*"})
@MapperScan("com.caihua.mapper")
//@ServletComponentScan(basePackages = {"com.caihua.filter","com.caihua.Listener"})
public class MyspringbootApplication{
    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}


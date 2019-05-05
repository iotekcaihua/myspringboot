package com.caihua.config;

import com.caihua.intecptor.LoginIntecptor;
import com.caihua.intecptor.SubmitIntecptor;
import com.caihua.util.MyConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new LoginIntecptor()).addPathPatterns("/**");
        registry.addInterceptor(new SubmitIntecptor()).addPathPatterns("/good/buyGoods");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new MyConverter());
    }
}

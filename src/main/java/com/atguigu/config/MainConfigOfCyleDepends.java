package com.atguigu.config;

import com.atguigu.bean.CircleDepandA;
import com.atguigu.bean.CircleDepandB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * spring 利用三级缓存解决循环依赖
 *
 https://blog.csdn.net/github_38687585/article/details/82317674
 *
 *
 * @author yaoyizhou
 * @date 2019/10/11 17:46
 * @desc
 */
@Configuration
public class MainConfigOfCyleDepends {

    @Bean
    public CircleDepandB circleDepandB(){
        return new CircleDepandB();
    }
    @Bean
    public CircleDepandA circleDepandA(){
        return new CircleDepandA();
    }
}

package com.gaoyuan.test;

import com.atguigu.gaoyuan.Gaoyuan;
import com.atguigu.gaoyuan.GaoyuanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述:
 * 模拟aop动态代理简单实现
 *
 * @author yaoyizhou
 * @date 2019/8/9 14:15
 * @desc
 */
public class IOC_CustomAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GaoyuanConfig.class);
        //此处返回的是代理对象
        Gaoyuan bean = context.getBean(Gaoyuan.class);
        bean.query();
//        System.out.println(context.getBean("gaoyuan"));
    }
}

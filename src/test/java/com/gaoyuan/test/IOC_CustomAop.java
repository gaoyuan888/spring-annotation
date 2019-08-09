package com.gaoyuan.test;

import com.atguigu.gaoyuan.Gaoyuan;
import com.atguigu.gaoyuan.GaoyuanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ��������:
 * ģ��aop��̬�����ʵ��
 *
 * @author yaoyizhou
 * @date 2019/8/9 14:15
 * @desc
 */
public class IOC_CustomAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GaoyuanConfig.class);
        //�˴����ص��Ǵ������
        Gaoyuan bean = context.getBean(Gaoyuan.class);
        bean.query();
//        System.out.println(context.getBean("gaoyuan"));
    }
}

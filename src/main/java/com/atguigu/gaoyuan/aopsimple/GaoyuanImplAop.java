package com.atguigu.gaoyuan.aopsimple;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * ��������:
 * ���ô�����
 *
 * @author yaoyizhou
 * @date 2019/8/9 14:15
 * @desc
 */
@Component
public class GaoyuanImplAop implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //ע�⣬��������ioc�е��඼�������
        //ֻ��ָ����bean���������ش�����
        if (beanName.equals("gaoyuan")) {
            Class<?> aClass = bean.getClass().getInterfaces()[0];
            Class[] c = new Class[]{aClass};
            //�������
            Object proxyInstance = Proxy.newProxyInstance(GaoyuanImplAop.class.getClassLoader(), c, new GaoyuanInvocationHandler(bean));
            return proxyInstance;
        }
        //��������ֱ�ӷ���
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


}

package com.atguigu.gaoyuan.aopsimple;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * 功能描述:
 * 后置处理器
 *
 * @author yaoyizhou
 * @date 2019/8/9 14:15
 * @desc
 */
@Component
public class GaoyuanImplAop implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //注意，这里所有ioc中的类都会进这里
        //只对指定的bean做代理，返回代理类
        if (beanName.equals("gaoyuan")) {
            Class<?> aClass = bean.getClass().getInterfaces()[0];
            Class[] c = new Class[]{aClass};
            //代理对象
            Object proxyInstance = Proxy.newProxyInstance(GaoyuanImplAop.class.getClassLoader(), c, new GaoyuanInvocationHandler(bean));
            return proxyInstance;
        }
        //其他的类直接返回
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


}

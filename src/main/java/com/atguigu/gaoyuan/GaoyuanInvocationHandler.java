package com.atguigu.gaoyuan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��������:
 *
 * @author yaoyizhou
 * @date 2019/8/9 14:25
 * @desc
 */
public class GaoyuanInvocationHandler implements InvocationHandler {
    Object o;

    public GaoyuanInvocationHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("aop----before");
        //o ������ʵ����
        Object invoke = method.invoke(o);
        //��ӡ��׺
        System.out.println("aop---after");
        return invoke;
    }
}

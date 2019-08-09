package com.atguigu.gaoyuan;

import org.springframework.stereotype.Component;

/**
 * ¹¦ÄÜÃèÊö:
 *
 * @author yaoyizhou
 * @date 2019/8/6 19:26
 * @desc
 */
@Component("gaoyuan")
public class GaoyuanImpl implements Gaoyuan {

    public GaoyuanImpl() {
        System.out.println("gaoyuanImpl init");
    }

    @Override
    public void query() {
        System.out.println("gaoyuanImpl query");
    }
}
